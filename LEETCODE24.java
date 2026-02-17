class Solution {
    public int maxSubArray(int[] nums) {
        // Initializing the currsum with the 1st element of the array
        // Subarray can not be empty 
        int curSum = 0;
        // Initialize the maxSum with the 1st element
        // tracks the maximum subarray sum so far
        int maxSum = nums[0];
        // loop iterates through the array starting from index 1
        // because index 0 is already used to initialize the currsum and maxSum
        for(int i =0;i<nums.length;i++){
            // Checks if the current sum has become negative.
            if(curSum < 0){
                // If current sum is negative, reset it to 0
                curSum = 0;
            }
            // Add current element to the running sum
            curSum = curSum + nums[i];
            // Update global maximum if currentSum is greater
            maxSum = Math.max(curSum , maxSum);
        }
        return maxSum;
    }
}
