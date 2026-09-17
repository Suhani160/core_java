import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] marks = new int[5];

        System.out.println("Please enter the marks for 5 students:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("\n--- Marks Record ---");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " scored: " + marks[i]);
        }

        scanner.close(); 
    }
}