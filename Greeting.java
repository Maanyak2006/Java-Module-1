import java.util.*;

class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age:");
        String name=sc.nextLine();
        int age=sc.nextInt();
        System.out.println("hello "+name+" my age is "+age);
    }
}
