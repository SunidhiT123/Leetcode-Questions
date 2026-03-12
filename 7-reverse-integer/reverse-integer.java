class Solution {
    public static int reverse(int x) {
        int reverseno=0;
        while(x!=0){
            int ld=x%10;
            if((reverseno > Integer.MAX_VALUE/10) || (reverseno < Integer.MIN_VALUE/10)){
                return 0;
            }
            reverseno=(reverseno*10)+ld;
            x=x/10;
        }
        return reverseno;
 }
}
