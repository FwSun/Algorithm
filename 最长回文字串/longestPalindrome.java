//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
public String longestPalindrome(String s){
	if(s.isEmpty()) return s;
	int n = s.length();
	boolean dp[][] = new boolean[n][n];
	int left=0,right=0;
	for(int i=n-2;i>=0;--i){
		dp[i][i]=true;
		for(int j=i+1;j<n;++j){
			//此题中动态规划的转移公式dp[i][j]==dp[i+1][j-1]&&S[i]==S[j]
			dp[i][j] = (s.charAt(i)==s.charAt(j)&&(dp[i+1][j-1]||j-i<3));//当j-i<3时，即aba类型一定是回文串
			if(dp[i][j]&&(j-i)>(right-left)){
				left = i;
				right = j;
			}
		}
	}
	return  s.substring(left,right+1);

}