import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] num1=new int[n];
        
        int count =0;
        for (int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                num1[count]=nums[i];
                count++;
            }
        }
        return count;

        
    }
}
 class eliminate {
    public static void main(String [] as)
    {
        Solution sol=new Solution();
        System.out.println(sol.removeElement([3,2,2,3],3));
    }
    
}
