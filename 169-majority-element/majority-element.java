class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> m =new HashMap<>();
       int n=nums.length;
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        
        if(m.get(num)>n/2){
            return num;
        }
    }
        return -1;
}
}