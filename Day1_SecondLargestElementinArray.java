class Solution {
    public int getSecondLargest(int[] arr) {
      
      int fst=Integer.MIN_VALUE;
      int sec=Integer.MIN_VALUE;
      
      for (int i=0;i<arr.length;i++){
          if(fst<arr[i]){
            sec=fst;
            fst=arr[i];
                
          }else if(arr[i]>sec && arr[i]!=fst){
              sec =arr[i];
          }
      }
      return (sec==Integer.MIN_VALUE) ? -1:sec;
    }
}
