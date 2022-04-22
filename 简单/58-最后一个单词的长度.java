class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean flag = false;
        for(int i = s.length() - 1; i > -1 ; i--){
            if(len == 0 && s.charAt(i) != ' '){
                flag = true;
            }
            if(flag){
                if(s.charAt(i) != ' '){
                    len++;
                }
                else{
                    break;
                }
            }
        }
        return len;
    }
}
