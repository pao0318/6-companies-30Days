// https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/#
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        int n=string_list.length;
        
        HashMap<String,Integer> map=new HashMap<>();
        int pos=0;
        List<List<String>> res=new ArrayList<>();
   
       for(int i=0;i<n;i++){
        //   Sorting the string
           String str=string_list[i];
           char []temp= new char[str.length()];
           temp=str.toCharArray();
           Arrays.sort(temp);
           String sorted=new String(temp);
           
           List<String> list=new ArrayList<>();

           if(map.containsKey(sorted)){
                int pos2=map.get(sorted);
               list=res.get(pos2);
               list.add(str);
               
               
           }
               
           else{
                list.add(str);
               map.put(sorted,pos);
               res.add(list);
               pos++;
               
           }
       }
       
       return res;
       
    }
}
