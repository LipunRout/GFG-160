class Solution {
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> list=new ArrayList<>();
        HashSet<String> set =new HashSet<>();
        helper(s,list,set,"");
        Collections.sort(list);
        return list;    
    }
    public void helper(String s,List<String> list,HashSet<String> set,String newString){
        if(s.length()==0){
            if(set.contains(newString)){
                return;
            }
            else{
                list.add(newString);
                set.add(newString);
                return;
            }
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String str=s.substring(0,i)+s.substring(i+1);
            helper(str,list,set,newString+ch);
            
        }
    }
}
