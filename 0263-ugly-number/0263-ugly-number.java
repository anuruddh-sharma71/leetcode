class Solution {
    public boolean isUgly(int n) {
       if(n <= 0){
        return false;
       }
       int[] facts = {2, 3, 5};
       for(int f : facts){
        while(n % f == 0){
            n /= f;
        }
       }
       return n == 1;
    }
}