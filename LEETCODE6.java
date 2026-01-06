public class LEETCODE6 {
    // Using Kadane's Algorithm
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; // Maximum Sum (initialize to the smallest possible value)
        int cs = 0; // Current Sum
        
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0; // Reset current sum to 0 if it goes negative
            }
            ms = Math.max(ms, cs); // Update the maximum sum
        }
        
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        kadanes(numbers); // Example input
    }
}