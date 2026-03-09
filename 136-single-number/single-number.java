class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s1=new TreeSet<>();
        Map<Integer,Integer> m1= new HashMap<>();
        for(int num:nums){
            s1.add(num);
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        for(int num:s1){
            if(m1.get(num)==1){
                return num;
            }
        }
        return -1;
}
}