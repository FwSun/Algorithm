//题解：https://www.cnblogs.com/geek1116/p/9389236.html
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null||nums.length<=0) return 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;++i){
            if(nums[i] == 0) nums[i] = -1;
        }
        int ans = 0,sum = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;++i){
            sum += nums[i];
            if(map.get(sum)==null){
                map.put(sum,i);
                continue;
            }else{
                int j = map.get(sum);
                int tmp = i-j;
                if(tmp>ans) ans = tmp;
            }
            
        }
        return ans;
        
    }
}