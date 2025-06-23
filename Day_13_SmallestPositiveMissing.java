
class Solution {
    public int missingNumber(int[] arr) {
        int size=arr.length;
        int i=0;
        int temp=0;
        while(i<size){
            if(arr[i]>0 && arr[i]<=size && arr[i]!=arr[arr[i]-1]){
                temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
            else i++;
        }
        for( i=0;i<size;i++){
            if(arr[i]!=i+1)return i+1;
            
        }
        return size+1;
    }
}
