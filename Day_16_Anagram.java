class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        
        if(m!=n){
            return false;
        }
        else{
            int count[]=new int[26];
            for (int i=0;i<m;i++){
                count[s1.charAt(i)-'a']++;
            }
            for (int i=0;i<n;i++){
                count[s2.charAt(i)-'a']--;
            }
            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
        }
    }
}
