class Solution {
    public void reverseArray(int arr[]) {
        int[] newArr=new int[arr.length];
       int last=arr.length-1;
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[last];
            last--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=newArr[i];
        }
    }
}
