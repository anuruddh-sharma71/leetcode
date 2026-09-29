class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) ->{
            if(a[1] < b[1]) return -1;
            else  return 1;
        });
        int st = points[0][1];
        int count = 1;
        // int minArr = 0; end = -1;
        for(int i = 0; i < points.length; i++){
            if(points[i][0] > st){
                count++;
                st = points[i][1];
            }
        }
        return count;
        
    }
}