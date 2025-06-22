class Solution {
    public int circularSubarraySum(int arr[]) {
       int n=arr.length;
      int mn=Integer.MAX_VALUE;
       int mx=Integer.MIN_VALUE;
       int s1=0,s2=0,total=0;
       
       
       for(int i=0;i<n;i++){
           total+=arr[i];
           s2=Math.min(arr[i],s2+arr[i]);
           mn=Math.min(mn,s2);
           s1=Math.max(arr[i],s1+arr[i]);
           mx=Math.max(mx,s1);
       }
        return Math.max(mx,total-mn);
    }
}
