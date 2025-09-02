public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        // Copy using loop
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Print copied array
        System.out.print("Copied Array: ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
