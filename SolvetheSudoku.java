// User function Template for Java

class Solution {
    static boolean isValid(int num,int[][] mat,int row ,int col){
        for(int i=0;i<9;i++){
            if(mat[row][i]==num) return false;
        }
        for(int i=0;i<9;i++){
            if(mat[i][col]==num) return false;
        }
        int rr=row-row%3,cc=col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(mat[rr+i][cc+j]==num) return false;
            }
        }
        return true;
    }
    
    
    
    static boolean solveSudoku(int[][] mat) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]==0){
                    for(int k=1;k<=9;k++){
                        if(isValid(k,mat,i,j)){
                            mat[i][j]=k;
                            boolean ans=solveSudoku(mat);
                            if(ans) return true;
                            else mat[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
