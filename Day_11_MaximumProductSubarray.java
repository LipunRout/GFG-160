class Solution {
    int maxProduct(int[] arr) {
        int ps=1,pe=1,len=arr.length,ans=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            ps*=arr[i];
            pe*=arr[len-1-i];
            if(ps>pe){
                ans=Math.max(ans,ps);
            }
            else{
                ans= Math.max(ans,pe);
            }
            
            if(ps==0) ps=1;
            
            if(pe==0) pe=1;
        }
        return ans;
    }
}
