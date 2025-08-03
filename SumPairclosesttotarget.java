class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> ans=new ArrayList<>();
        if(arr.length<2) return ans;
        
        Arrays.sort(arr);
        
        int i=0,j=arr.length-1;
        int diff=Integer.MAX_VALUE;
        int first=-1,sec=-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            int cD=Math.abs(sum-target);
            if(cD<diff || (cD==diff && arr[j]-arr[i]>sec-first)){
                first=arr[i];
                sec=arr[j];
                diff=cD;
                
            }
            if(sum<=target) i++;
            else j--;
            
        }
        ans.add(first);
        ans.add(sec);
        return ans;
        
    }
}
