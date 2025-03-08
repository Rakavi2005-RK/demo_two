// concatenation of two variables in generics
import java.io.*;
import java.util.*;
class A<T ,v >
{
    T x;
    v y;
    A(T val,v val1)
    {
        x=val;
        y=val1;

    }
    void fnDisplay()
    {
        System.out.println("the concatented value is:"+(x));
    }

}
class Gen1
{
    public static void main(String [] as) throws Exception
    {
    A<String,String> obj=new A<String,String>("hello","world");
    obj.fnDisplay();
    }   
}