class Solution {
    public int longestUniqueSubstr(String s) {
        if(s==null || s.length()==0){
            return -1;
            
        }
        int max=0;
        int start=0;
        int end=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(end<s.length()){
            char cc=s.charAt(end);
            if(map.containsKey(cc)){
                start=Math.max(start,map.get(cc)+1);
               
            }
            map.put(cc,end);
            max=Math.max(end-start+1,max);
            end++;
            
        }
        return max;
        
    }
}
