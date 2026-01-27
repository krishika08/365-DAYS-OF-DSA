class Solution {

    // we declares the main function that takes the array and target value 
    // returns integer array
    public int[] searchRange(int[] nums, int target) {

        // searching for the first occurence of the target 
        int first = findBound(nums, target, true);

        // we will check if the result is -1 , if exists that means the target do not exists       in the array
        if (first == -1) {
            // if the target do not found ,return [-1,-1]
            return new int[]{-1, -1};
        }

        // search for the last occurence of the target
        int last = findBound(nums, target, false);
        // return the result array that has both start and end occurence of the target
        return new int[]{first, last};
    }

    // the helper method that does actually the Binary search logic
    // isfirst flag tells that which side we needs to move,either left or right
    // basically tells about the directional flag
    public int findBound(int[] nums, int target, boolean isFirst) {

        // set the start pointer to the beginning of the array that is to initialize the start pointer array
        int start = 0;
        // set the end pointer to the last element of the array that is we initialize the end pointer array
        int end = nums.length - 1;
        // we create a variable bound and also initialize it to -1
        // this will store our answer
        int bound = -1;
        // this is the loop that runs  till the time if the start is less than end and equal 
        while (start <= end) {
            // Caalculate  the mid index
            int mid = start + (end - start) / 2;
            // check if the middle value index is equal to the target 
            if (nums[mid] == target) {
                // we found the target 
                // we will be storing the target index but we will not stop searching
                bound = mid;
                // if we are searching for the first index that is the left index
                if (isFirst) {
                    // eliminate the right side and move left to see if there is the earlier occurence of the target element
                    end = mid - 1;   // search left
                } else {
                    // eliminate the left side and move right to see that if there is the next later occurence of the target element
                    start = mid + 1; // search right
                }

                // if the middle value is smaller than the target ,the target must be on right side
            } else if (nums[mid] < target) {
                // we will move the  start pointer next the middle that is on right of middle
                start = mid + 1;
            } else {
                // move the end pointer before the middle 
                end = mid - 1;
            }
        }
        // return the final indx found thatwe have calculated
        return bound;
    }
}
