//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//根据推到可以算出f(n) = 2*f(n-1)
public int JumpFloorII(int target) {
        if(target<=0) return 0;
        else if(target==1) return 1;
        else return((int)Math.pow(2,target-1));
    }