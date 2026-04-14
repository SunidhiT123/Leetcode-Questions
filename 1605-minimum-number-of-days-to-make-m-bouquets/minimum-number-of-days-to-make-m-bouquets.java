class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;

        if(m*k>n)return -1;

        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        int ans=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;

            if(canMake(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private boolean canMake(int[] bloomDay,int mid,int m,int k){
        int count=0;
        int bouquets=0;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;

                if(count==k){
                    bouquets++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        return bouquets>=m;
    }
}