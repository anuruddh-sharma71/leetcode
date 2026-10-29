class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // Option 1: Last three elements
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        // Option 2: First two elements and the last element
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(product1, product2);
    }
}