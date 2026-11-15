import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }
        
        return n == 1;
    }

    private int getSumOfSquares(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;      // Extract the last digit
            totalSum += digit * digit;
            n = n / 10;              // Remove the last digit
        }
        return totalSum;
    }
}