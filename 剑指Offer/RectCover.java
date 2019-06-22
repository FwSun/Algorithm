//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
//本题的实质仍然是斐波拉契数列
public int RectCover(int target) {
        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        int res[] = new int[target+1];
        res[1] = 1;
        res[2] = 2;
        for(int i=3;i<=target;++i){
            res[i] = res[i-2] + res[i-1];
        }
        return res[target];

    }