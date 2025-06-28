class Solution {
    static char nonRepeatingChar(String s) {
       int[] fr=new int[26];
       for(char ch:s.toCharArray()){
           fr[ch-'a']++;
       }
       for(char ch:s.toCharArray()){
           if(fr[ch-'a']==1) return ch;
       }
        return '$';
    }
}
