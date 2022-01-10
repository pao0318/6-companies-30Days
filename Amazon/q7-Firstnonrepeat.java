// https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1#
class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder str= new StringBuilder();
        Deque<Character> dq = new ArrayDeque<>();
        
        char[] repeat = new char[26];
        
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            
            if(repeat[ch-'a']==0)
                dq.add(ch);
            repeat[ch-'a']++;
            
            while(!dq.isEmpty() && repeat[dq.peek()-'a']!=1)
                dq.poll();
                
            if(!dq.isEmpty())
                str.append(dq.peek());
            else
                str.append('#');
              
        }
        return str.toString();
        
    }
}
