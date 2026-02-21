class Solution {
    public int search(int[] nums, int target) {
        // Iniatializes the left pointer at the beginning of the array
        int left = 0;
        // initializes the right pointer to the last index of the array
        int right = nums.length - 1;

        // Runs binary search until the search space becomes invalid
        while(left <= right){
            // calculates the middle index of the current search space
            int mid = (left + right)/2;
            // checks if the middle element is equal to the target
            if(nums[mid] == target){
                // if equals to the mid then return the mid target element index 
                return mid;
            }

            // Checks if the left half is sorted
            if(nums[left] <= nums[mid]){
                // checks whether the target lies outside the sorted left half
                if(target < nums[left] || target > nums[mid]){
                    // then will shift the search to the right half
                    left = mid+1;
                }
                else{

                    right = mid-1;
                } 
            }
            else{
                // checks whether the target lies outside the sorted right half
                if(target > nums[right] || target < nums[mid]){
                    // then shift the search to the left half
                    right = mid-1;
                }
                else{
                    // search in the right half
                   left = mid+1; 
                }
            }
        }
        // if the target does not found then after the loop ends return -1
        return -1;
    }
}
