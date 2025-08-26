import java.util.*; 

class EvenOddChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter an integer: "); 
        int number = input.nextInt(); 

        // Check if the number is even or odd using the modulo operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

    }
}
