class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s1=new HashSet<>();
        int n=-1;

        for(int i=nums.length-1;i>=0;i--){
            if(s1.contains(nums[i])){
                n=nums[i];
            }
            else{
                s1.add(nums[i]);
            }
        }
        return n;
    }
}