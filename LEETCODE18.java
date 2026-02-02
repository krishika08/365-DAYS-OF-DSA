class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array to use two pointer and avoid duplicates
        Arrays.sort(nums);
        // Creates a list to store all valid unique triplets whose sum is 0
        List<List<Integer>> result = new ArrayList<>();

        // Fix first element one by one or iterate one by one
        // then stop if all the nexxt elemenyts becomes positive
        // as sum cannot be 0 after that
        for(int i = 0; i < nums.length && nums[i] <= 0; i++){

            // Skip duplicate values for the first element
            if(i == 0 || nums[i] != nums[i-1]){
                // calls the helper function to find remaining two numbers using two pointer technique
                twoSum2(nums,i,result);
            }
        }
        // return the final list of the triplets
        return result;
    }

    // helper function to find the two numbers such that the sum becomes 0
    void twoSum2(int[] nums,int i,List<List<Integer>> result){
        // Left pointer starts jusst after the fixing the first element
        int left = i+1;
        // Right pointer starts from the end of the  array
        int right = nums.length - 1;

        // Run the loop until both the pointers meet
        while(left < right){
            // Calculates the sum of current triplet
            int sum = nums[i] + nums[left] + nums[right];

            // Checks if the sum is smaller than the zero
            if(sum < 0){
                // Move left pointer towarss right to increse the sum
                left++;
            }
            // Checks if the sum is greater than zero
            else if(sum > 0){
                // Moves the right pointer towards left to decrease the sum
                right--;
            }
            // If the  sum is exactly 0, we found a valid triplet founds
            else{
                // Adds the valid triplet to the result
                result.add(Arrays.asList(nums[i] , nums[left++], nums[right--]));


                // Skip duplicate values for left pointer to stop repeatition

                while(left < right && nums[left] == nums[left-1]){
                    ++left;
                }
            }
        }
    }
}
