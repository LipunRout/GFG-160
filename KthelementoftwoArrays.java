// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
       int n=a.length;
       int m=b.length;
       int i=0,j=0;
       
       while(true){
           if(i==n){
               return b[j+k-1];
           }
           if(j==m){
               return a[i+k-1];
           }
           if(k==1){
               return Math.min(a[i],b[j]);
           }
           
           int mid=k/2;
           int newI= Math.min(i+mid,n)-1;
           int newJ= Math.min(j+mid,m)-1;
           
           if(a[newI] <= b[newJ]){
               k-=(newI - i +1);
               i= newI+1;
           }
           else{
               k-=(newJ-j+1);
               j=newJ+1;
           }
       }
        
    }
}
