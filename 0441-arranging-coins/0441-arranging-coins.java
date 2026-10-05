class Solution {
    public int arrangeCoins(int n) {
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = l + (r - l) / 2;
            long coins = (long) mid*(mid + 1) / 2;
            if(coins == n) return  mid;
            else if(coins < n) l = mid + 1;
            else r = mid - 1;

        }
        return r;
    }
}