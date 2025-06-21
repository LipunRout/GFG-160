class Solution {
    int maxSubarraySum(int[] arr) {
        int sum=0;
     
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans=Math.max(ans,sum);
            if(sum<0) sum=0;
        }
        
        return ans;
    }
}
