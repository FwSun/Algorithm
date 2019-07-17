class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals==null||intervals.length==0) return intervals;
        //将原来的二维数组按照数组第一个元素的大小进行排序
        Arrays.sort(intervals,new Comparator<int[]>(){
            //自定义排序函数
            @Override
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        
        
        int len = intervals.length;
        ArrayList<int[]> list = new ArrayList<int[]>();
        //遍历并且将合并后的数组放入到list中
        for(int i=0;i<len;++i){
            int[] tmp = new int[2];
            tmp[0] = intervals[i][0];   
            tmp[1] = intervals[i][1];
            //合并规则：当当前数组的后一个元素大于后一个数组的第一个元素时需要合并
            while(i<len-1&&intervals[i+1][0]<=tmp[1]){
                //判断合并后数组的最后一个元素的值
                tmp[1] = Math.max(tmp[1],intervals[i+1][1]);
                ++i;
            }
            list.add(tmp);
        }
        
        int[][] res = new int[list.size()][2];
        //将ArrayList<int[]>类型转化为二维数组int[][]
        res = list.toArray(res);
        return res;
        
    }
}   