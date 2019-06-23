  /*
    给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
    解法：主要是将几种情况思路捋清楚
        ①当指数exponent==0时，直接返回1即可
        ②当exponent<0时，此时base不能为0，因为分母不能为0.
        ③当exponent>0时正常操作

    注：本题解法有待改进，通过位运算来提高效率
  */
  public double Power(double base, int exponent) {
        int temp = exponent;
        double res = 1.0;
        if(exponent==0) return 1;
        else if(exponent<0) {
            if(base==0) return 0;
            exponent = -exponent;
        }
        for(int i=1;i<=exponent;++i){
            res *= base;
        }
        if(temp<0) return 1/res;
        else return res;
        
        
  }