import java.io.*;
import java.util.*;
interface inf
{
    // Scanner sc=new Scanner(System.in);
   
    public void add(double a,double b);
    public void sub(double a,double b);

}
 class A implements inf
{

     double x,y;
    public void add(double a,double b)
    {
        
        this.x=a;
        this.y=b;
        System.out.println("the value is :"+(x+y));
        
       
    }
    public void sub(double a,double b)
    {
        
        this.x=a;
        this.y=b;
        System.out.println("the value is:"+ (x-y));
        
        

    }

}
class set18
 {
    public static void main(String [] as)
    {
       double  d,e;
        Scanner sc=new Scanner(System.in);
        d=sc.nextDouble();
        e=sc.nextDouble();
         A obj=new A();
         obj.add(d,e);
         d=sc.nextDouble();
        e=sc.nextDouble();
         obj.sub(d,e);
        

    } 

    
}
