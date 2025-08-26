class SquareArray {
    public static void main(String[] args) {
        int[] squares = new int[10];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = (i + 1) * (i + 1); 
        }
        System.out.println("Array elements (squares of numbers 1 to 10):");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Index " + i + ": " + squares[i]);
        }
    }
}
