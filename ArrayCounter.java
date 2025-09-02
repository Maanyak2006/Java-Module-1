class ArrayCounter {
    public static void main(String[] args) {
        int[] numbers = {10, 60, 30, 80, 45, 90, 20, 75};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                count++;
            }
        }

        System.out.println("Number of elements greater than 50: " + count);
    }
}
