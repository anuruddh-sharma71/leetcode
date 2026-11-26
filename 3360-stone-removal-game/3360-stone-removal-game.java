class Solution {
    public boolean canAliceWin(int n) {
        // if(n < 10) return false;
        int take = 10;
        int count = 0;
        while(n >= take){
              n  = n - take;
              count++;
              take--;
        }
        return count % 2 == 1;
    }
}