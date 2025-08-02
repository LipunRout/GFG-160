class Solution {
    public int countTriplets(int[] arr, int target) {
       int n=arr.length;
       int res=0;
       for(int i=0;i<n-2;++i){
           int l=i+1;
           int r=n-1;
           while(l<r){
               int sum=arr[i]+arr[l]+arr[r];
               if(sum<target){
                   ++l;
               }
               else if(sum>target){
                   --r;
                   
               }
               else if(sum==target){
                   int c1=0;
                   int c2=0;
                   int el1=arr[l];
                   int el2=arr[r];
                   while(l<=r && el1==arr[l]){
                       c1++;
                       l++;
                   }
                   while(l<=r&& el2==arr[r]){
                       c2++;
                       r--;
                       
                   }
                   if(el1==el2){
                       int m=c1+c2;
                       res+=(m*(m-1))/2;
                   }
                   else{
                       res+=c1*c2;
                   }
               }
           }
       }
       return res;
    }
}
