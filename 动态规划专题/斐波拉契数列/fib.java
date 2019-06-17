  
//教程链接：http://mp.weixin.qq.com/s?__biz=MzU0MDg5OTYyOQ==&mid=100000157&idx=1&sn=c33e5824fa0e7d483ee17d35f0970d31&chksm=7b3361df4c44e8c9db4fbea00f03a9fdcaa7c9213c99cbf844ec49a5b3e1546d3fd24e31***d#rd
  //方法一：暴力递归实现，时间复杂度为2的n次方
    public int fib(int n){
        if(n==1||n==2) return 1;
        return fib(n-1)+fib(n-2);
    }

    //memory记录了已经算过的值，避免了重复计算，将时间复杂度降为O(n)
    //采用了自顶向下的计算方法
    public int fibWithRemenber(int n){
        if(n==1||n==2||n<0) return 1;
        int memory[] = new int[n+1];
        memory[1] = 1;
        memory[2] = 1;
        return fibhelper(memory,n);

    }
    public int fibhelper(int memory[],int n){
        if(n>0&&memory[n]==0){
            memory[n] = fibhelper(memory,n-1)+fibhelper(memory,n-2);
            return memory[n];
        }
        return memory[n];
    }
    //动态规划，采用自底向上的方法
    public int DBFib(int n){
        int memory[] = new int[n+1];
        if(n<=2) return 1;
        memory[1] =1;
        memory[2] = 1;
        for(int i=3;i<=n;++i){
            memory[i] = memory[i-1]+memory[i-2];
        }
        return memory[n];
    }