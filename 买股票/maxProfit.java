  /*
    解题思路:画出价格曲线,将每一个波峰和波谷的值加起来即可
    */
    public int maxProfit(int[] prices) {
        if(prices.length<=0) return 0;
        int vally = prices[0];
        int peek = prices[0];
        int i=0;
        int profit = 0;
        while(i<prices.length-1){

            while(i<prices.length-1&&prices[i]>=prices[i+1])++i;
            vally = prices[i];

            while(i<prices.length-1&&prices[i]<=prices[i+1]) ++i;
            peek = prices[i];

            profit += (peek-vally);

        }
        return profit;
    }