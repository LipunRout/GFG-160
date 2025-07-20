

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
       int n =mat.length;
       for(int i=0;i<n;++i){
           if(search(mat,i,x)){
               return true;
           }
       }
       return false;
    }
    boolean search(int[][] mat,int rowNo,int x){
        int l=0;
        int r=mat[rowNo].length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(mat[rowNo][mid]==x){
                return true;
            }
            else if(mat[rowNo][mid]<x){
                l=mid+1;
                
            }else{
                r=mid-1;
            }
        }
        return false;
    }
}
