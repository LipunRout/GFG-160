// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
       Arrays.sort(arr);
       int l=0;
       int r=arr.length-1;
       int c=0;
       while(l<r){
           int sum=arr[l]+arr[r];
           if(sum<target){
               c+=r-l;
               ++l;
           }
           else{
               --r;
           }
       }
       return c;
        
    }
}
