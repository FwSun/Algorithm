 //本题解答链接：http://mp.weixin.qq.com/s?__biz=MzU0MDg5OTYyOQ==&mid=100000157&idx=1&sn=c33e5824fa0e7d483ee17d35f0970d31&chksm=7b3361df4c44e8c9db4fbea00f03a9fdcaa7c9213c99cbf844ec49a5b3e1546d3fd24e31***d#rd
 //第一种：递归算法
//f(n) = min{f(n-ci)|i=1,2,3...k}+1
 public int coinChange(int[] coins, int amount) {
 	if(amount==0) return 0;
 	int ans = Integer.MAX_VALUE;
 	for(int i=0;i<coins.length;++i){
 		if(amount-coins[i]<0)continue;//金额不可达
 		int res = coinChange(coins,amount-coins[i]);//递归，先解决子问题
 		if(res==-1) continue;//子问题无解
 		if(res+1<ans) ans = res;
 	}

return ans==Integer.MAX_VALUE?-1:ans;
        
}
//通过记录备忘录来避免重复计算
public int coinChange2(int[] coins,int amount){
	int[] mem = new int[amount];
	for(int i=0;i<mem.length;++i){
		mem[i] = -2;
	}


	return coinChangeHelper(coins,amount,mem);

}

public int coinChangeHelper(int coins[],int amount,int mem[]){
	int ans = Integer.MAX_VALUE;
	if(amount<=0) return 0;
	if(mem[amount] != -2) return mem[amount];
	for(int i=0;i<coins.length;++i){
		if(amount-coins[i]<0)continue;
		int res = coinChangeHelper(coins,amount-coins[i],mem);
		if(res==-1) continue;
		if(res+1<ans) ans = res+1;
	}
	ans = (ans==Integer.MAX_VALUE?-1:ans);
	mem[amount] = ans;
	return ans;

}
//动态规划解决问题
//状态转移公式：f(n) = min{f(n-ci)|i=1,2,3...k}+1
public int coinChange3(int coins[],int amount){
	int db[] = new int[amount+1];
	for(int i=0;i<db.length;++i){
		db[i] = Integer.MAX_VALUE;
	}
	db[0] = 0;
	for(int i=0;i<db.length;++i){
		for(int coin:coins){
			if((i-coin)<0)continue;
			db[i] = db[i]<db[i-coin]?db[i]:db[i-coin]+1;
		}

	}
	return db[amount]==Integer.MAX_VALUE?-1:db[amount];

}