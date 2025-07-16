class Solution {
    public int kthMissing(int[] arr, int k) {
        int l=0,r=arr.length;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]-(mid+1)<k){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l+k;
        
    }
}
