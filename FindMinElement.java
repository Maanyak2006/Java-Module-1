class FindMinElement {

    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 20, 3, 15};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The minimum element in the array is: " + min);
    }
}
