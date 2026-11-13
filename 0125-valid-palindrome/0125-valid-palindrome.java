class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        
        int l = 0, r = s.length() - 1;
        
        while (l < r) {
            char charL = s.charAt(l);
            char charR = s.charAt(r);
            
            if (!Character.isLetterOrDigit(charL)) {
                l++;
            } 
            else if (!Character.isLetterOrDigit(charR)) {
                r--;
            } 
            else {
                if (Character.toLowerCase(charL) != Character.toLowerCase(charR)) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}