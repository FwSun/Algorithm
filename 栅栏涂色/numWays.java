  /*
    其一， 假设“相邻栅栏”不能相同颜色，那么有
    dp[i] = dp[i-1] * (k-1)

    “连续的3个栅栏”不能相同颜色，那么可以把前两个栅栏看成一个整体，转化为“相邻栅栏”问题。
    所以有，dp[i] = (dp[i-2] + dp[i-1]) * (k-1)
  */
  public int numWays(int n, int k) {
        if(n==0||k==0) return 0;
        int dp[] = new int[n];
        if(n==1) return k;
        if(n==2) return k*k;
        dp[0] = k;
        dp[1] = k*k;
        for(int i=2;i<n;++i){
            dp[i] = (dp[i-1]+dp[i-2]) *(k-1);
        }
        return dp[n-1];
        
    }