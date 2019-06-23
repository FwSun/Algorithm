
/**
第一遍遍历将所有的值全部存入Map之中
第二遍遍历判断(target-当前数)的值是否存在于之前的Map之中，存在的话则返回结果
**/
 public int[] twoSum1(int target,int num[]){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;++i){
            map.put(num[i],i);
        }
        for(int i=0;i<num.length;++i){
           int  complete = target-num[i];
            if(map.containsKey(complete)&&map.get(complete)!=i){
                return new int[]{i,map.get(complete)};
            }
        }
        return null;
    }


    //上面的方法进行了两次for循环，其实一次for循环也可以搞定
    public int[] twoSum2(int target,int num[]){
        Map<Integer,Integer>map = new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;++i){
            int complete = target-num[i];
            if(map.containsKey(complete)){

                return new int[]{i,map.get(complete)};
            }
            map.put(num[i],i);
        }
        return null;
    }