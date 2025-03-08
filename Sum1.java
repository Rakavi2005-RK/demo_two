import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,k,n,b;
        n=nums.length;
        List<List<Integer>> sum=new ArrayList<>();
        
        
        for(i=0;i<n-2;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                 b= nums[i]+nums[j]+nums[k];
                
                if(b==0)
                {
                    List<Integer> small=new ArrayList<>();
                    small.add(nums[i]);
                    small.add(nums[j]);
                     small.add(nums[k]);
                     sum.add(small);   

               }
                }
                
            }
        }
        for(List<Integer> duplicate : sum)
        {
          Collections.sort(duplicate);
            }
        for(i=0;i<sum.size();i++)
        {
            for(j=i+1;j<sum.size();j++)
                {
                    if (sum.get(i).equals(sum.get(j)))
                    {
                        sum.remove(i);
                        
                        
                    }

                }
            
            }


        

        return sum;


        
    }
}
 class Sum1 {
    public static void main(String [] as){
        Solution sol=new Solution();
        int[] arr={0,0,0,0};
        System.out.println(sol.threeSum(arr));
        
    }
    
}
