public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5, 3, 2};
        int target = 2;   // number to count
        int count = 0;

        // Count occurrences
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Number " + target + " appears " + count + " times.");
    }
}
