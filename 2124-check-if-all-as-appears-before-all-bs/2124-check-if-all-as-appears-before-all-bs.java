class Solution {
    public boolean checkString(String s) {
        if(s.length() < 2) return true;
        for(int i = 0; i < s.length() -1; i++){
            if(s.charAt(i) == 'b' && s.charAt(i + 1) == 'a'){
                return false;
            }
        }
        return true;
    }
}