    public int climbStairs(int n) {
        //第n级台阶的达到方法：可以在第n-1级爬一层，也可以在第n-2层爬两层，即f(n) = f(n-1)+f(n-2)就是斐波拉契数列
        //利用空间换时间，先列出动态规划的出口，即只有一级台阶和两级台阶的情况。
        //其他情况都可以由前往后推论而出
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int ans[] = new int[n+1];
        ans[1] = 1;
        ans[2] =2;
        for(int i=3;i<=n;++i){
            ans[i] = ans[i-1]+ans[i-2];
        }
        return ans[n];
        
    }