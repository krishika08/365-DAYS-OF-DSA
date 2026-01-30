class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;                 // pointer at start
        int right = numbers.length - 1; // pointer at end

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // +1 because array is 1-indexed in the problem
                return new int[] { left + 1, right + 1 };
            } 
            else if (sum < target) {
                left++;   // need a bigger sum
            } 
            else {
                right--;  // need a smaller sum
            }
        }

        // Problem guarantees exactly one solution
        return new int[] {};
    }
}
