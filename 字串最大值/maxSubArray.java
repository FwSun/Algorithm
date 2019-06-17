 /*
 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
 public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len<=0) return 0;
        int ans=nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;++i){
            //如果sum<0,说明sum对之后的和没有积极影响，应该选择从后面重新开始
            if(sum <0 ) sum = nums[i];
            else sum += nums[i];
            //每次都必须要更新最大值
            if(sum>ans) ans = sum;
        }
        return ans;
        
        
    }