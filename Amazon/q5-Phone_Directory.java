// https://practice.geeksforgeeks.org/problems/phone-directory4628/1/#

class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        HashSet<String> set = new HashSet<>();
       for (String ele : contact) {
           set.add(ele);
       }
       contact = new String[set.size()];
       int j = 0;
       for (String ele : set) {
           contact[j++] = ele;
       }
       

        ArrayList<ArrayList<String>> res= new ArrayList<>();
        int len=s.length();
        int pos=1;
        Arrays.sort(contact);
 
        while(pos<=len){
            String str=s.substring(0,pos);
            
            ArrayList<String> temp= new ArrayList<>();
            for(int i=0;i<contact.length;i++){
                String s1=contact[i];
                if(s1.length()<pos)
                    continue;
                
                String s2=contact[i].substring(0,pos);
                if(s2.equals(str))
                    temp.add(s1);
            }
                    
                if(temp.size()==0)
                    temp.add("0");
  
            res.add(temp);
            pos++;
        }
        
        
        return res;
    }
}
