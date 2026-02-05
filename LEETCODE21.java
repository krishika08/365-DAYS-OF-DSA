class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create a hashset to store elements from the array
        HashSet<Integer> Numbers = new HashSet<>();
        // Iterate through each element in the array
        for(int i : nums){
            // Check if the element is already in the Hashset
            if(Numbers.contains(i)){
                // Duplicates found
                return true;
            }
            // Add element to the hashset
            Numbers.add(i);
        }
        // No duplicates found
        return false;
    }
}
