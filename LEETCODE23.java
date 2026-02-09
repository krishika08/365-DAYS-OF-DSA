class Solution {
    public int[] productExceptSelf(int[] nums) {
        // this creates a array named result of the same length as nums to store the final answer
        int[] result = new int [nums.length];
        // Fills the entire array with 1 as 1 does not afect the multiplication
        Arrays.fill(result,1);
        // Initializing the two variables pre and post
        // pre for the prefix product 
        // post for the postfix product
        int pre = 1, post = 1;
        // loop runs from left to right to calculate the product of each index
        for(int i =0;i < nums.length;i++){
            // Store the product of all the elements before current index in the result array
            result[i] = pre;
            // Updates the prefix product by multiplying the current element
            pre = nums[i] * pre;
        }
        // Loop runs from right to left to calculate the postfix product
        for(int i = nums.length - 1;i >= 0;i--){
            // Multiplies the existing prefix product with the postfix product
            result[i] = result[i] * post;
            // Updates the postfix product by multiplying the current element
            post = post*nums[i];
        }
        // Returns the final array containing the product except itself
        return result;
    }
}
