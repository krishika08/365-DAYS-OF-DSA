class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Creates a Hashmap to store numbers and their indices
        // first Integer is here used for the key (number from the array)
        // Second Integer is here used for the value(i.e index of the number) 
        Map<Integer,Integer> map = new HashMap<>(nums.length);

        int n = nums.length;
        // Iterate through the array
        // i represents the current index of the array
        for(int i = 0; i < nums.length;i++){
            // Calculate the complement of the current number
            // Calculates the required number that when added to nums[i],will be giving the target value
            int complement = target - nums[i];

            // Check if the complement is already exists in the HashMap
            if(map.containsKey(complement)){
                // if found , return the indices of the complement and the current number
                // map.get(complement)[index of the first number]
                // i is the index of the current number
                return new int[]{map.get(complement),i};
            }

            // otherwise, add the current number and its index to the map
            // this stores the current number and its index in the HashMap
            map.put(nums[i],i);
        }

        // return an empty array if no solution is found (this case won't occur as per problem constraints)
        return new int[]{};
    }
}
