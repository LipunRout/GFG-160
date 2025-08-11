class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
       int n=arr.length,r=0,l=0;
       for(int x:arr)r+=x;
       for(int i=0;i<n;i++){
           r-=arr[i];
           if(l==r)return i;
           l+=arr[i];
           
       }
       return -1;
        
    }
}
