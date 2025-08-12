// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> pS=new HashMap<>();
        int n=arr.length,sum=0,ans=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                ans=i+1;
            }
            else if(pS.get(sum-k)!=null){
                ans=Math.max(ans,i-pS.get(sum-k));
                
            }
            if(pS.get(sum)==null){
                pS.put(sum,i);
            }
        }
        return ans;
    }
}
