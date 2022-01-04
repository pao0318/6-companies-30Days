// https://practice.geeksforgeeks.org/problems/run-length-encoding/1/# 
class GfG
 {
	String encode(String str)
	{
          String s="";
          
          int count=1;
          for(int i=1;i<str.length();i++){
              if(str.charAt(i)==str.charAt(i-1)){
                  count++;
              }
             
              else{
                  s+=str.charAt(i-1)+String.valueOf(count);
                  count=1;
              }
          }
          return s+String.valueOf(str.charAt(str.length()-1))+String.valueOf(count);
	}
	
 }
