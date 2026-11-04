class Solution {
    public int minMoves(int[] nums) {
     int n = nums.length;
     int count = 0; 
     Arrays.sort(nums);
     for(int i : nums){
        count += nums[n - 1] - i;
     }
     return count;
    }
}