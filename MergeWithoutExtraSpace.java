// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        int n=a.length,m=b.length,i=n-1,j=0;
        
        while(i>=0 && j<m){
            if(a[i]<=b[j]){
                break;
            }
            int temp =a[i];
            a[i]=b[j];
            b[j]=temp;
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
    }
}
