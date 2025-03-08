import java.util.*;
import java.lang.String.*;
class Solution {
    public String  lengthOfLongestSubstring(String s) 
    {
        String s1=s;
         ArrayList<String> arr = new ArrayList<> ();
        for(int i=0;i<s1.length();i++)
        {
            
            arr.add( Character.toString(s1.charAt(i)) );
           
        }
   
        int i=0;
       for(i=0;i<(arr.size()-1);i++)
        {
              
            if (arr.get(i)==arr.get(i+1))
            {
                
                arr.add(i+1,"/");
               

                
            }
            

        }
     
            
            
           
        
        
        String arr1=arr.toString();
        return arr1;
         

            
        
            

        

            
                    
        
        
        
    }
}
class Longsub 
{
    public static void main(String [] as)
    {
        Solution sol=new Solution();
        System.out.println(sol.lengthOfLongestSubstring("pwweke"));
    }
}