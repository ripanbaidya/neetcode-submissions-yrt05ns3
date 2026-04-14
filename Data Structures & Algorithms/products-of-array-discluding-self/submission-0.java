class Solution {
    /**
     * Helper function which will compute the product of nums excepte the index
     * that has to exclude.
     */
    private int computeProduct(int[] nums, int idxToExclude) {
        int prod = 1;
        
        for (int i = 0; i < nums.length; i ++) {
            if (i == idxToExclude) continue;

            prod *= nums[i];
        }

        return prod;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i ++) {
            result[i] = computeProduct(nums, i);
        }

        return result;    
    }
}  
