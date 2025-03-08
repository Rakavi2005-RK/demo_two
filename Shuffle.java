class ok
{
    public void restoreString(String s,int[] indices)
    {
        String a="";
        for(int x=0;x<s.length();x++)
        {
            int count=x;
            int t=0;
            for(int y=0;y<indices.length;y++)
            {
                if(x!=indices[y])
                {
                    t++;  
                }
                else{
                    a=a+Character.toString(s.charAt(t));
                }
            }
            
        }
        System.out.println(a);
    }
}

public class Shuffle {
    public static void main(String[] as)
    {
        ok sol=new ok();
        int[] ind={4,5,6,7,0,2,1,3};
        sol.restoreString("codeleet",ind);
    }
    
}
