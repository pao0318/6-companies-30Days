// https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1/#
class Solution
{
    static String keypad[] = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        return helper("",a,0,N); 
    }
    static ArrayList<String> helper(String p,int a[], int index, int n){
        ArrayList<String> res = new ArrayList<>();
        if(index == n){
            res.add(p);
            return res;
        }
        
        String s = keypad[a[index]];
        for(int i=0;i<s.length();i++){
            res.addAll(helper(p+s.charAt(i), a, index+1, n));
        }
        return res;
    }
}
