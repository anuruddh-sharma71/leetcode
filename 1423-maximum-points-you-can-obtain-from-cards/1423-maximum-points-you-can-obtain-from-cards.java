class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ws = 0;
        int n = cardPoints.length;
        int r = n-k;
        for(int i = 0; i < n; i++){
            ws += cardPoints[i];
        }
        int s = 0;
        for(int j = 0;j < r ; j++){
            s += cardPoints[j];
        }
        int min = s;
        for(int l = r; l < n; l++){
            s += cardPoints[l];
            s -= cardPoints[l - r];
            min = Math.min(s, min);
        }
        int ans  = ws - min;
        return ans;

    }
}
        // int max = ws;
        // for(int j = k; j < n; j++){
        //     ws += cardPoints[j];
        //     ws -= cardPoints[j -k];
        //     max = Math.max(max, ws);
        // }