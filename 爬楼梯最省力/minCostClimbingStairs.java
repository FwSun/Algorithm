 //746. 使用最小花费爬楼梯
 public int minCostClimbingStairs(int[] cost) {
        if(cost==null||cost.length<2) return 0;
        
        int len = cost.length;
        //题目为每次可以选择爬一个或者两个楼梯，然后在倒数第一个楼梯或者最后一个楼梯可以上楼，为了计算方便，直接在数组末尾添加一个0作为楼梯的顶部。
        int costWithEnd[] = new int[len+1];
        System.arraycopy(cost,0,costWithEnd,0,len);
        //设置楼梯的顶部体力值为0
        costWithEnd[len] = 0;
        //【到达】每一级楼梯需要消耗的体力
        int ans[] = new int[len+1];
        ans[0] = cost[0];
        ans[1] = cost[1];
        for(int i=2;i<len+1;++i){
            //由于你到达了当前楼梯，因此每一个当前点的最少花费都需要加上当前点的花费。
            ans[i] = costWithEnd[i]+Math.min(ans[i-1],ans[i-2]);
        }
        return ans[len];
            
        
        
       
        
       
        
    }