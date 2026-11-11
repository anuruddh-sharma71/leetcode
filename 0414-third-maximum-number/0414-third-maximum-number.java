import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> topThree = new TreeSet<>();

        for (int num : nums) {
            topThree.add(num);
            if (topThree.size() > 3) {
                topThree.pollFirst(); // Remove the smallest element in the set
            }
        }

        // If less than 3 unique numbers exist, return the largest element
        if (topThree.size() < 3) {
            return topThree.last();
        }

        return topThree.first();
    }
}