class Solution {
    public int findMin(int[] nums) {
        
        // Initializes a variable left to 0 
        // Represents the starting index of the array
        int left = 0;
        // Initializes the right pointer to the last index of the array
        int right = nums.length -1;
        // Initializes the ans with the 1st element of the array 
        // Stores the minimum value found so far
        int ans = nums[0];

        // Checks if the array has only 1 element
        if(nums.length == 1){
            // If the array has 1 element then return the element as its minimum
            return nums[0];
        }

        // Starts a loop that continues until the left pointer crosses the right pointer
        while(left <= right){
            // If the current portion of the array is already sorted then the leftmost element is minimum
            if(nums[left] < nums[right]){
                // Update the ans with the smaller value between current ans and nums[left]
                ans = Math.min(ans,nums[left]);
            }
            // Calculates the middle index of the current search space
            int mid = (left + right)/2;

            // updates the ans with the smaller value between current ans and nums[mid]
            ans = Math.min(ans,nums[mid]);
            // checks if the left half is sorted
            if(nums[left] <= nums[mid]){
                // Move to right half if sorted
                left = mid+1;
            }
            else{
                // move the right pointer to search the left half
                right = mid-1;
            }
        }
        // Returns the minimum element found so far
        return ans;
    }
}
