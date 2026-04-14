class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < nums.length; i ++) {
      int expected = target - nums[i];

      // pair found
      if (map.containsKey(expected)) {
        return new int[]{map.get(expected), i};
      }

      map.put(nums[i], i);
    }

    return new int[0];
  }
}