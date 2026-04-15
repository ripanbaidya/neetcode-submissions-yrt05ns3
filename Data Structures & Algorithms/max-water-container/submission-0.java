class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i ++) { // first bar
            for (int j = i+1; j < n; j ++) {
                // compute the current water it is holding
                int curr = Math.abs(j-i) * Math.min(heights[i], heights[j]);
                maxi = Math.max(maxi, curr);
            }
        }

        return maxi;
        
    }
}
