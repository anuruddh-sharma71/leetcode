class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = lowerBound(nums, target + 1) - 1;
        
        if (first < nums.length && nums[first] == target) {
            return new int[]{first, last};
        }
        return new int[]{-1, -1};
    }

    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}