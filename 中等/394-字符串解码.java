import java.util.Stack;

/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> counStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int index = 0;
        while(index < s.length()){
            char ch = s.charAt(index);
            if(Character.isDigit(ch)){
                StringBuffer ret = new StringBuffer();
                while(Character.isDigit(s.charAt((index)))){
                    ret.append(s.charAt(index++));
                }
                counStack.push(Integer.parseInt(ret.toString()));
            }
            else if(ch == '['){
                resStack.push(res);
                res = "";
                index++;
            }
            else if(ch == ']'){
                StringBuffer t = new StringBuffer(resStack.pop());
                int count = counStack.pop();
                for(int i = 0; i < count; i++){
                    t.append(res);
                }
                res = t.toString();
                index++;
            }
            else{
                res += s.charAt(index++);
            }
        }
        return res;
    }
}
// @lc code=end

