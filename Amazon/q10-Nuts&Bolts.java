// https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1#
class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
         LinkedHashMap<Character,Boolean> m=new LinkedHashMap<>();
        m.put('!',true);
        m.put('#',true);
        m.put('$',true);
        m.put('%',true);
        m.put('&',true);
        m.put('*',true);
        m.put('@',true);
        m.put('^',true);
        m.put('~',true);
        HashSet<Character> set1=new HashSet<>();
        
        for(char p: nuts)
        {
            set1.add(p);
        }
       
        
        int i=0;
        for(char ch: m.keySet())
        {
            if(set1.contains(ch))
            {
                nuts[i]=ch;
                bolts[i]=ch;
                i++;
            }
        }
    }
}
