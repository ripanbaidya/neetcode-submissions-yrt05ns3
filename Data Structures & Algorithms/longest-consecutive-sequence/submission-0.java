class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0)
      return 0;

    int maxi = 1;
    // [100,4,200,1,3,2]
    Arrays.sort(nums);
    // [1,2,3,4,100,200]

    int currLen = 1;
    for (int i = 1; i < nums.length; i ++) {
      if (nums[i-1] == nums[i]) {
        // equal - do nothing
      } else if (nums[i-1]+1 == nums[i]) {
        // consequtive
        currLen ++;
        maxi = Math.max(maxi, currLen);
      } else
        currLen = 1;
    }

    return maxi;
  }
}