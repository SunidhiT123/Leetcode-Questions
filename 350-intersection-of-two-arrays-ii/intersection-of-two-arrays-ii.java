class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int n1:nums1){
            m1.put(n1,m1.getOrDefault(n1,0)+1);
        }

        List<Integer> l1=new ArrayList<>();
        for(int n2:nums2){
            if(m1.containsKey(n2) && m1.get(n2)>0){
                l1.add(n2);

                m1.put(n2,m1.get(n2)-1); 
            }
        }
        int[] result=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            result[i]=l1.get(i);
        }
        return result;
    }
}