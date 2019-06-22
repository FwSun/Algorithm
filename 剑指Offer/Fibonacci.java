    //斐波拉契数列
    /*
        解题思路：利用公式 f(n)=f(n-1)+f(n-2) 动态规划解题
    */
    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1||n==2)return 1;
        int res[] = new int[n+1];
        res[1] = 1;
        res[2] = 1;
        for(int i=3;i<=n;++i){
            res[i] = res[i-1]+res[i-2];
        }
        return res[n];

    }