//题目：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//采用的是滑动窗口的思想，时间复杂度是O(n)
public int lengthOfLongestSubstring(String s){
	//set用来保存目前没有与j处重复的字串
	Set<Character> set = new HashSet<Character>();
	int i=0,j= 0,ans = 0;
	while(i<s.length()&&j<s.length()){
		//如果滑动到右侧最新的字符串与已有的字符串不重复，则继续往前走
		if(!set.contains(s.charAt(j))){
			//ans保存历史最大的字串长度
			ans = Math.max(ans,j-i+1);
			set.put(s.charAt(j));
			++j;	
		}else{
			//如果滑动到右侧最新的字符串与已有的字符串重复，则从左往右依次剔除字符串
			set.remove(s.charAt(i++));
		}
	}
	return ans;
}