 /*
 在一个二维数组中（每个一维数组的长度相同），
 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
 /*
    解题思路：
 */
 public boolean Find(int target, int [][] array) {
        //数组的长度
        int row = array.length;
        //数组的宽度
        int col = array[0].length;
        int k = 0;
            while(k<col){
            int temp = array[row-1][k];
            if(temp==target) return true;
            //目标大于左下角元素，则向右搜索
            else if(temp<target) ++k;
             //目标元素小于左下角元素，则向上搜索
            else{
                for(int i=row-1;i>=0;--i){
                    //如果搜索到则返回true
                    if(array[i][k]==target) return true;
                }
                ++k;
            }
        }
        return false;

    }