import java.io.*;
import java.util.*;
public class Zo {
    public static void main(String [] as)
    {
        int i,j,n=0,k,a;
        for(i=1;i<6;i++)
        {
            k=i;
            a=n/2;
            int f=0;
            System.out.printf(String.format("%"+(6-i)+"d",i));
            for(j=1;j<(n+1);j++)
            {
                if(i!=1 && (a>f))
                {
                    k=k+1;
                    f++;
                    
                }
                else if(i!=1 && k>i)
                {
                    k-=1;

                }
                else{
                    continue;
                }
                System.out.print(k);

            }
            n+=2;
           System.out.println();
           
        }
            
    }

}
    

