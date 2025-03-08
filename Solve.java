class Solution {
    public boolean isPalindrome(int x) {
        int count=0;

        String s= Integer.toString(x);
        int i=0;
        int j=s.length()-1;
        while(i<=s.length()-1)
        {

            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
        
    }
}
class Solve {
    public static void main (String [] as)
{
    Solution new1=new Solution();
    System.out.println(new1.isPalindrome(121));
}
   
        
        
    }
