import java.util.*;

class ArrayEvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < 5; i++) {
            if (n[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}
