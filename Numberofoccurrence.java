class Solution {
    int countFreq(int[] arr, int target) {
        
       int fs=firstIndex(arr,target);
       if(fs==-1) return 0;
       int ls = lastIndex(arr,target);
       return (ls-fs)+1;
        
    }
        public int firstIndex(int[] arr, int target){
        int firstindex=-1,low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                firstindex=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return firstindex;
        
    }
        public int lastIndex(int[] arr, int target){
        int lastindex=-1,low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                lastindex=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return lastindex;
        
    }
}
    

