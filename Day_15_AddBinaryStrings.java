\
class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder sb=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        
        int carry=0;
        while(i>=0 || j>=0 || carry==1){
            int sum=carry;
            if(i>=0){
                sum=sum+s1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum=sum+s2.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;
        }
        String res=sb.reverse().toString();
       return res.replaceFirst("^0+(?!$)","");
    }
}
