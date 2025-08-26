import java.util.*; 

class SubjectMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter marks for Subject 1:");
        float marks1 = scanner.nextFloat(); 

        System.out.println("Enter marks for Subject 2:");
        float marks2 = scanner.nextFloat(); 

        System.out.println("Enter marks for Subject 3:");
        float marks3 = scanner.nextFloat(); 

        
        float totalMarks = marks1 + marks2 + marks3;

        
        float averageMarks = totalMarks / 3;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

    }
}
