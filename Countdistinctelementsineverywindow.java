class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int n =arr.length,j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> Fr=new HashMap<>();
        for(int i=0;i<n;i++){
            Fr.put(arr[i],Fr.getOrDefault(arr[i],0)+1);
            if(i>=k-1){
                ans.add(Fr.size());
                Fr.put(arr[j],Fr.get(arr[j])-1);
                if(Fr.get(arr[j])==0)Fr.remove(arr[j]);
                j++;
            }
        }
        return ans;
    }
}
