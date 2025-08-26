class ArraySearch {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 40, 15, 30};
        int targetElement = 15;
        int foundIndex = -1; 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetElement) {
                foundIndex = i; 
                break; 
            }
        }
        if (foundIndex != -1) {
            System.out.println("Element " + targetElement + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }
}
