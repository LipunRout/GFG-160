// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int temp=1,c=0;
        int n=arr.length,index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)temp*=arr[i];
            else{
                c++;
                index=i;
                
            }
            
        }
        int ans[] =new int[n];
        if(c>1) return ans;
        if(c==1){
            ans[index]=temp;
            return ans;
        }
        for(int i=0;i<n;i++){
            ans[i]=temp/arr[i];
        }
        return ans;
        
    }
}
