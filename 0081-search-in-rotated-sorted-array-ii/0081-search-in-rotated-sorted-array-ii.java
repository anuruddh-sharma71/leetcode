class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0; 
        int r = n - 1;
        if(nums[l] == target || nums[r] == target) return true;
        if(n < 2 && nums[0] == target) return true;
        while(l < r){
            int mid = (l + r) / 2;
            if(nums[mid] == target) return true;
            else if(nums[mid] > target) r--;
            else l++;
        }
        return false;
    }
}