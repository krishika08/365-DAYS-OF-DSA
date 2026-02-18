class Solution {
    public int maxProduct(int[] nums) {
        // Initializing min,max and result with the 1st element

        // max stores the maximum product ending at previous index
        int max = nums[0];
        // min stores the manimum product ending at previous index
        int min = nums[0];
        // result is the overall maximum profit found so far
        int result = nums[0];

        // Traverse the array starting from index 1
        // because index 0 is already used for initialization
        for (int i = 1; i < nums.length; i++) {
            // Stores the current element in a variable curr
            int curr = nums[i];

            // If current number is negative 
            // Multiplication will flip the sign 
            if (curr < 0) {
                // Store the current value of max temporarily
                int temp = max;
                // Assign old minimum value to max
                max = min;
                // Assign old maximum value (stored in temp) to min
                min = temp;
            }

            // here we have 2 choices:
            // 1). Starts a new subarray from curr
            // 2). Continue the previous maximum subarray and then multiply (max * curr)
            max = Math.max(curr, max * curr);
            // updates the minimum product ending at the current index
            // Here also we are having the 2 choices:
            // 1).Start a new subarray from curr
            // 2).Continue the previous minimum subarray and then (min * curr)
            min = Math.min(curr, min * curr);
            // updates the overall maximum product found so far
            // max is the maximum product ending at current index
            // result is the maximum product found anywhere in the array till now
            result = Math.max(result, max);
        }
        // Return the final maximum product
        return result;
    }
}
