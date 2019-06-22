    
//题目：旋转数组的最小值
/*
	解题思路：如果最小值不是第一位,那么最小值肯定小于其前面的元素,否则的话第一位是最小值
*/
    public int minNumberInRotateArray(int [] array) {
        if(array==null) return 0;
        for(int i=0;i<array.length-1;++i){
            if(array[i+1]<array[i]) return array[i+1];
        }
        return array[0];
    
    }