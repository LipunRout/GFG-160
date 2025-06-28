// User function Template for Java

class Solution {
    void comLPS(String pat,int[] lps,int m){
        int i=1;
        int j=0;
        while(i<m){
            if(pat.charAt(i)==pat.charAt(j)){
                lps[i]=j+1;
                ++j;
                ++i;
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    lps[i]=0;
                    ++i;
                }
            }
        }
    }

    ArrayList<Integer> search(String pat, String txt) {
        int N=txt.length();
        int M=pat.length();
        
        int[] lps=new int[M];
        comLPS(pat,lps,M);
        int i=0;
        int j=0;
        ArrayList<Integer> res=new ArrayList<>();
        while(i<N){
            if(j<M && txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
           }
           
          if(j==M){
               res.add(i-j);
               j=lps[j-1];
           }
           
           else if(i<N && txt.charAt(i)!=pat.charAt(j)){
               if(j!=0){
                   j=lps[j-1]; 
               }else{
                   i++;
                  
               }
           }
        }
        return res;
    }
}
