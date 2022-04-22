class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int lenth = 0;
        int maxLength = 0;
        while(right < s.length()){
            boolean rst = set.add(s.charAt(right));
            if(rst == true){
                lenth++;
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
                lenth--;
            }
            if(lenth > maxLength){
                maxLength = lenth;
            }
        }
        return maxLength;
    }
}
