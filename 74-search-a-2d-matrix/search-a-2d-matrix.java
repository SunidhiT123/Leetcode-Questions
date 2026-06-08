class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;

        int l=0;
        int h=r*c-1;

        while(l<=h){
            int m=(l+h)/2;

            int row=m/c;
            int column=m%c;

            if(matrix[row][column]==target){
                return true;
            }
            else if(matrix[row][column]>target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return false;
    }
}