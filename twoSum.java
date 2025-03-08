class Solution{
    public int[] subSequence(int[] nums,int k)
    {
        int total=0;
        int[] dup=new int[k];
        for(int i=0;i<=nums.length-k+1;i++)
        {
            int sum=0;
            for(int j=i;j<k;j++)
            {
                sum+=nums[j];
            }
            if(total<sum)
            {
                total=sum;
                for(int q=0;q<k;q++)
                {
                    dup[q]=nums[i];
                    System.out.println(dup[q]);
                    i++;
                }

            }

        }
        return dup;
    }
}
public class twoSum {
    public static void main(String [] as)
    {
        int[] arr={3,3,3,4};
        int a=2;
        Solution sol=new Solution();
        System.out.println(sol.subSequence(arr,a));
        
 
    }
    
}
