public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Swap first and last
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println("\nArray after swapping first and last:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
