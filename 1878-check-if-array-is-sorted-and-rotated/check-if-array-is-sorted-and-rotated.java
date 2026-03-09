class Solution {
    public boolean check(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                n++;
            }
        }
            if(nums[nums.length-1]>nums[0]){
                n++;
            }
            return n<=1;
    }
} 