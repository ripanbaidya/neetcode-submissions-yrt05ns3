class Solution {
    // Optimal - two pointer
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int maxi = Integer.MIN_VALUE;

        while (l < r) {
        // current water is's containing
        int curr = Math.abs(r - l) * Math.min(heights[l], heights[r]);
        // update the maximum water it might contains
        maxi = Math.max(maxi, curr);

        if (heights[l] < heights[r]) 
            l ++;
        else 
            r --;
        }

        return maxi;
    }
}
