class Solution {
    public void getAllSubset(int nums[],List<Integer> ans,int i,List<List<Integer>> allSubsets){
        if(i==nums.length){
            allSubsets.add(new ArrayList<> (ans));
            return;
        }

        ans.add(nums[i]);
        getAllSubset(nums,ans,i+1,allSubsets);

        ans.remove(ans.size()-1);
        int index=i+1;
        while(index<nums.length && nums[index]==nums[index-1]){
            index++;
        }
            getAllSubset(nums,ans,index,allSubsets);
        
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> allSubsets=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        getAllSubset(nums,ans,0,allSubsets);
        return allSubsets;
    }
}