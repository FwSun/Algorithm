
/*你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
*/


//     public int rob(int[] nums) {
//         if(nums.length<=0) return 0;
//         int ans = getRobAns(nums,nums.length);
//         return ans;
        
        
//     }
//     public int  getRobAns(int nums[],int n){
//         if(n<=0) return 0;
//         else if(n==1) return nums[0];
//         else{
//             int a = nums[n-1]+getRobAns(nums,n-2);
//             int b = getRobAns(nums,n-1);
//             return a>b?a:b;
//         }
//     }
    public int rob(int[] nums){
        //如果数组为空则返回0
        int len = nums.length;
        if(len<=0) return 0;
        //如果数组只有一个元素或者两个元素的情况
        int ans[] = new int[len];
        if(len==1) return nums[0];
        if(len==2) return nums[0]>nums[1]?nums[0]:nums[1];
        ans[0] = nums[0];
        ans[1] = nums[0]>nums[1]?nums[0]:nums[1];
        //动态规划解决其他情况
        //核心思想：每一间房屋小偷都可以选择偷或者不偷，取其中利益最大的选项
        for(int i=2;i<len;++i){
            int a = nums[i]+ans[i-2];
            int b = ans[i-1];
            ans[i] = a>b?a:b;
        }
        return ans[len-1];
        
    }