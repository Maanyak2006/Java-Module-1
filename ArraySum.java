import java.util.*;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        int sum = 0;

        System.out.println("Enter five numbers:");
        for (int i = 0; i <= 4; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            sum = sum + n[i]; 
        }

        System.out.println("Sum of numbers is: " + sum);
        float avg = (float) sum / n.length;
        System.out.println("Avg is: " + avg);
    }
}
