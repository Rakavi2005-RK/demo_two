
 class Summa {
    public void lengthOfLongestSubstring(String s) 
     {
        String[] arr=s.split("");
        for(int i=0;i<arr.length;i++)
        {
         System.out.println(arr[i]);
        }
 

        for(int i=0;i<(s.length()-1);i++)
        {
            if (s.charAt(i)==s.charAt(i+1))
            {
                s.substring(i,"/");


               
            }

        }


        for(int i=0;i<arr.length;i++)
        {
         System.out.println(arr[i]);
        }
 

     }
    
}
class New 
{
    public static void main(String [] as)
    {
        
        Summa sol=new Summa();
        sol.lengthOfLongestSubstring("pwweke");
    }
}
