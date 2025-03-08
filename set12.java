import java.io.*;
import java.util.*;
class  Solution
{
    Solution (int a)
    {
        if (a%2==0)
        {
            System.out.println("it's even");

        }   
        else
        {
            System.out.println("it's odd");

        } 
    }
    
} 
class set12
{
    public static void main(String [] as)
    {
        Scanner sc =new  Scanner(System.in);
        System.out.println("enter thw value:");
        int n;
        n=sc.nextInt();
        Solution obj=new Solution(n);
    }
} 