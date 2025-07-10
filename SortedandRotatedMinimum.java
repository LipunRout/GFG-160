// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
       
        int low=0,high=arr.length-1,n=arr.length;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
}
