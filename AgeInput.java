import java.util.*;
class AgeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your current year: ");
        int currentYear=scanner.nextInt();
        int age=currentYear-birthYear;
        System.out.println("Your age is: " + age);
    }
}
