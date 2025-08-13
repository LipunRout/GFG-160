class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer,Integer> pS=new HashMap<>();
        int n=arr.length,sum=0,ans=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]==1 ? 1:-1;
            if(sum==0){
                ans=i+1;
                
            }
            if(pS.get(sum)!=null){
                ans=Math.max(ans,i-pS.get(sum));
            }else{
                pS.put(sum,i);
            }
        }
        return ans;
    }
}
