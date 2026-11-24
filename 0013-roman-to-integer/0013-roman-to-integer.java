class Solution {
    private static final Map<Character, Integer> VALUES = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );

    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        // Scan from right to left so we already know the value to the right
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = VALUES.get(s.charAt(i));
            if (curr < prevValue) {
                total -= curr;
            } else {
                total += curr;
            }
            prevValue = curr;
        }

        return total;
    }
}