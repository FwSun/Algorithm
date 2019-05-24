
/**
第一遍遍历将所有的值全部存入Map之中
第二遍遍历判断(target-当前数)的值是否存在于之前的Map之中，存在的话则返回结果
**/
public int[] twoSum1(int target,int num[]){
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<num.size();++i){
		map.put(num[i],i);
	}
	for(int i=0;i<num[].size();++i){
		complete = target-num[i];
		if(map.contanisKey(complete)&&map.get(complete)!=i){
			return new int[]{i,map.get(complete)};
		}
	}
	return null;
}