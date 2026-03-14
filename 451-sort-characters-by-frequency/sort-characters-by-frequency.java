class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m1=new HashMap<>();
        for(char ch:s.toCharArray()){
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> l1=new ArrayList<>(m1.entrySet());
        l1.sort((a,b)-> b.getValue()-a.getValue());

        StringBuilder sb=new StringBuilder();

        for(Map.Entry<Character,Integer> entry: l1){
            char ch=entry.getKey();
            int freq=entry.getValue();

            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}