// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
       int[] newArr= new int[arr.length];
       int st=0;
       int end=arr.length-1;
        
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                newArr[st]=arr[i];
                st++;
            }
        }
        
        while(st<end){
            newArr[st++]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=newArr[i];
        }
        
        
    }
}
