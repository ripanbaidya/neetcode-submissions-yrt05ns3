class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    int[] res = new int[n-k+1];
    
    int it = 0;
    for (int i = 0; i <= n-k; i ++) {
      int j = i+k-1;
      res[it ++] = getMax(nums, i, j);
    }

    return res;
  }

  private int getMax(int[] nums, int s, int e) {
    int maxi = Integer.MIN_VALUE;
    for (int i = s; i <= e; i ++) {
      maxi = Math.max(maxi, nums[i]);
    }
    return maxi;
  }
}