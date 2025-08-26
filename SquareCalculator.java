import java.util.Scanner;

class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: "); 
        int number = sc.nextInt(); 

        int square = number * number; 

        System.out.println("The square of " + number + " is: " + square); 

    }
}
