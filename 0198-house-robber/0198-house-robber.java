class Solution {
    public int solve(int[] nums, int n, int[] dp){
        if(n <= 0) return 0;
        if(dp[n] != -1) return dp[n];
        int take  = nums[n - 1] + solve(nums, n - 2, dp);
        int not_take = solve(nums, n - 1, dp);
            
        return dp[n] = Math.max(take, not_take);

    }
    public int rob(int[] nums) {

       int n = nums.length;
       int[] dp = new int[n+1];
       Arrays.fill(dp, -1);
       return solve(nums, n, dp);
    }
}