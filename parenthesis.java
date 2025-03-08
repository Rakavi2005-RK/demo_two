import java.util.*;
class Right
{
    public boolean isValid(String s)
    {
        Stack<String> stk = new Stack<> ();
        if (s.charAt(0)==')'|| s.charAt(0)=='}'|| s.charAt(0)==']'|| (s.length()%2)!=0)
        {
            return false;
        }
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
             {
                stk.push(Character.toString(s.charAt(i)));
             }
             else 
            {
             String s1=stk.peek().toString();
            
             
             if ( s1.charAt(0)=='(' && s.charAt(i)==')')
                {
                stk.pop();
                s1=" ";
                }
            if (s1.charAt(0)=='{' && s.charAt(i)=='}')
                {
                    stk.pop();
                    s1=" ";
                }
                 
             if (s1.charAt(0)=='[' && s.charAt(i)==']')
            {
                    stk.pop();
                    s1=" ";

             }
                if (s1.charAt(0)!=s.charAt(i))
                {
                return false;
                
                }
             
             }
    
        
        }
    if (!stk.empty())
        {
            return false;
        }
        return true;
    }
}
    


class parenthesis 
{
    public  static void  main (String [] as)
    {
        Right ww=new Right();
       System.out.println( ww.isValid("()"));
    }
}
    

