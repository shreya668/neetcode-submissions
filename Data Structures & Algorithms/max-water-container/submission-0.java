class Solution {
    public int maxArea(int[] heights) {

        int i = 0;
        int j = heights.length-1;
        int max = -1;

        while(i < j) {
            int leftH = heights[i];
            int rightH = heights[j];

            int currVolume = (Math.min(leftH, rightH) * (j-i));
            if(currVolume > max) {
                max = currVolume;
            }

            if(leftH < rightH) i++;
            else j--;
        }      

        return max;          



    }
}
