    /*
    解题思路：将罗马数据的“元数据”加入到map之中。然后顺序遍历字符串，检查map是否包含相关的key
    检查时先以两个为单位，不存在则再以一个为单位
    注意：
        检查map是否包含key：map.containsKey()
        取字符串的字串：str.substring(i,j) //其中第j个字符不取


    */
    public int romanToInt(String s) {
        if(s==null) return 0;
        Map<String,Integer>map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        int sum=0;
        for(int i=0;i<s.length();++i){
            if((i+1<s.length())&&map.containsKey(s.substring(i,i+2))){
                sum += map.get(s.substring(i,i+2));
                ++i;
            }else{
                sum += map.get(s.substring(i,i+1));
            }
            
        }
        return sum;
        
        
    }