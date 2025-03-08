public class Zo1 {
    public static void main(String [] as)
    {
        String s="program";
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
            char s1 =s.charAt(i);
            System.out.print(String.format("%"+(i+1)+"s",s1));
            System.out.print(String.format("%"+(n-i-1)+"s",""));
            System.out.print(s1);
            System.out.println();
        }
    }
    
}
