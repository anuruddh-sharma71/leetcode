class Solution {
    public int lengthOfLastWord(String s) {
      s =  s.trim();
      int li = s.lastIndexOf(' ');
      return s.length() - li - 1;
    }
}