//跳阶梯问题，实质是斐波拉契数列
public int JumpFloor(int target) {
        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        int res[] = new int[target+1];
        res[1] = 1;
        res[2] = 2;
        for(int i=3;i<=target;++i){
            res[i] = res[i-1]+res[i-2];
        }
        return res[target];

    }