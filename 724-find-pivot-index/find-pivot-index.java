class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Step 1: Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: Check every index
        for (int i = 0; i < nums.length; i++) {

            // Right sum = Total - Left - Current Element
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            // Move current element to the left side
            leftSum += nums[i];
        }

        return -1;
    }
}