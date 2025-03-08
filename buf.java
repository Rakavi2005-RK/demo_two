import java.util.*;
import java.lang.*;
class  Try1{
    public void lengthofstring(String s)
    {
        char [] s1= s.toCharArray();
        for(int i=0;i<(s1.length-1);i++){
            System.out.println(s1[i]);
        }
        
        
        for(int i=0;i<(s1.length-1);i++)
        {
            if (s1[i]==s1[i+1])
            {
                s1[i+1]='/';
                System.out.println(s1[i]);
                

            }
            
        }
            
       // String str=s1.toString();
       // System.out.println(str);

    }
    
}
class buf{
    public static void main (String [] as )
    {
        Try1 too=new Try1();
        too.lengthofstring("pwweke");
    }
}
