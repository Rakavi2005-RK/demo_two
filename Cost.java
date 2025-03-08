class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int one=0;
        
        int count=0;
    

           
            for(int x=1;x<cost.length;x++)
            {
                if(cost[count]<cost[x] && count<cost.length-1)
                {
                    one+=cost[count];
                    count+=2;
                }
                else if(count==x && count<cost.length-1)
                {
                    one+=cost[count];
                    count+=2;
                }
                else{
                    one+=cost[x];
                }
            }
            return one;
        }

    }
     
public class Cost {
    public static void main(String[] as)
    {
        Solution sol=new Solution();
        int[] cost = {1,100,1,1,1,100,1,1,100,1,0};
        System.out.println(sol. minCostClimbingStairs(cost));
    }
    
}
