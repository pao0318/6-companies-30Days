// https://leetcode.com/problems/greatest-common-divisor-of-strings/
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String res="";
        int n1=str1.length();
        int n2=str2.length();
        
        if(n2>n1)
            return gcdOfStrings(str2,str1);
        if(n2==n1){
            if(str1.equals(str2))
                return str1;
            else
                return "";
        }
        else{
            if(str1.startsWith(str2)){
                return gcdOfStrings(str1.substring(str2.length()),str2);
            }
            else{
                return "";
            }
        }
    }
}
