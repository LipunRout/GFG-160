class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        int n=mat.length,m=mat[0].length;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == word.charAt(0)){
                    boolean[][] visit=new boolean[n][m];
                    if(dfs(i,j,mat,word,0,visit)){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
     static boolean valid(int i,int j,char[][] mat,boolean[][] visit,String word,int ind){
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length){
            return false;
        }
        if(visit[i][j] || word.charAt(ind) !=mat[i][j]){
            return false;
        }
        return true;
    }
     static boolean dfs(int i,int j,char[][] mat,String word,int ind,boolean[][] visit){
        if(ind==word.length()){
            return true;
        }
        if(!valid(i,j,mat,visit,word,ind)){
            return false;
            
        }
        visit[i][j]=true;
        boolean res= dfs(i+1,j,mat,word,ind+1,visit) ||
                        dfs(i-1,j,mat,word,ind+1,visit) ||
                        dfs(i,j+1,mat,word,ind+1,visit) ||
                        dfs(i,j-1,mat,word,ind+1,visit);
        visit[i][j]=false;
        return res;    
    }
}
