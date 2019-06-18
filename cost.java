  //题目：粉刷房子
  //解题思路：每一间房子都有三种粉刷的可能，每一种的最小值都要依赖于前面房子的粉刷颜色，利用原来的二维数组，求出每个房子粉刷每种颜色的最小值
  public int minCost(int[][] costs) {
        if(costs.length<=0||costs==null) return 0;
        for(int i=1;i<costs.length;++i){
            costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][1],costs[i-1][0]);
            
        }
        return Math.min(costs[costs.length-1][0],Math.min(costs[costs.length-1][1],costs[costs.length-1][2]));
        
    }