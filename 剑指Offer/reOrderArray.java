   /*
        输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
        使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
        并保证奇数和奇数，偶数和偶数之间的相对位置不变。

        解题思路：采用空间换时间的策略
        ①顺序扫描一遍原数组，将奇数都放进奇数数组，偶数都放进偶数数组
        ②依次将奇数数组和偶数数组里的元素填充进原数组
   */
   public void reOrderArray(int [] array) {
        int len = array.length;
        if(len==0) return;
        //奇数数组
        int[] oddArray = new int[len];
        //偶数数组
        int[] evenArray = new int[len];
        //奇数和偶数数组的下标索引
        int indexOdd = 0,indexEven = 0;
        //顺序扫描一遍原数组，将奇数都放进奇数数组，偶数都放进偶数数组
        for(int i=0;i<array.length;++i){
            if(array[i]%2==0) evenArray[indexEven++] = array[i];
            else oddArray[indexOdd++] = array[i];
        }
        //依次将奇数数组和偶数数组里的元素填充进原数组
        for(int i=0;i<indexOdd;++i) array[i] = oddArray[i];
        int k = 0;
        for(int i=indexOdd;i<len;++i) array[i] = evenArray[k++];
        
    }