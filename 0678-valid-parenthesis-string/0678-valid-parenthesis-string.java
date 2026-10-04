class Solution {
    public boolean checkValidString(String s) {
        int mino = 0; // Minimum required open parentheses
        int maxo = 0; // Maximum possible open parentheses

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                mino++;
                maxo++;
            } else if (ch == ')') {
                mino--;
                maxo--;
            } else if (ch == '*') {
                mino--; // Treating '*' as ')'
                maxo++; // Treating '*' as '('
            }

            // If maxo drops below 0, there are too many closing brackets to balance
            if (maxo < 0) {
                return false;
            }

            // mino cannot be negative (reset to 0 if it drops below 0)
            if (mino < 0) {
                mino = 0;
            }
        }

        // If mino == 0 after checking all characters, all '(' can be balanced
        return mino == 0;
    }
}