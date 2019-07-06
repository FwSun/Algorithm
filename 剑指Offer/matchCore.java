//请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
// 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null) return false;
        return matchCore(str,0,pattern,0);

    }
    public boolean matchCore(char[] str,int s,char[]pattern,int p) {
        //模式串结束而匹配串没结束，返回false
        if (s < str.length && p >= pattern.length) return false;
        //两者同时结束，匹 是的完成，返回true
        if (s >= str.length && p >= pattern.length) return true;
        //匹配串结束，模式串没结束【例：a*】||两者都没有结束
        if (p + 1 < pattern.length && pattern[p + 1] == '*') {
            //当匹配串已经结束时
            if (s == str.length) return matchCore(str, s, pattern, p + 2);
                //当模式串第一个字符是'.'或者跟当前模式串匹配时第二个字符是'*'时
            else if (str[s] == pattern[p] || pattern[p] == '.') {
                return matchCore(str, s + 1, pattern, p) ||
                        matchCore(str, s, pattern, p + 2) ||
                        matchCore(str, s + 1, pattern, p + 2);
                //当模式串第一个字符不跟当前模式串匹配第二个字符是'*'时
            } else return matchCore(str, s, pattern, p + 2);
            //当匹配串第二个字符不是'*'时
        } else {
            //每次都要首先判断模式串是否已经结束
            if (s >= str.length) return false;
            else {
                if (pattern[p] == '.' || pattern[p] == str[s]) return matchCore(str, s + 1, pattern, p + 1);
                else return false;
            }

        }

    }
}