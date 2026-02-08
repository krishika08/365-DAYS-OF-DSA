class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // creates a hashmap to store numbers and the index
        HashMap<Integer, Integer> map = new HashMap<>();
        // Starts the loop to traverse the array from index 0 to the last index
        for (int i = 0; i < nums.length; i++) {
            // Check if the current number already exists in the HashMap
            if (map.containsKey(nums[i])) {

                // Check if the distance between indices is <= k
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            // Stores the current number with its index in the HahMap
            // If the number already exists, this updates it with the NEWER index
            map.put(nums[i], i);
        }
        return false;
    }
}
