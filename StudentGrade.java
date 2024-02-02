import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println(">>>>> WELCOME TO THE STUDENT GRADE CALCULATOR<<<<<:");
        Scanner scanner = new Scanner(System.in);
        int totalmarks = 0;
        int totalsubjects = 0;
        try {
            System.out.println("Enter the number of subjects:");
            totalsubjects = scanner.nextInt();
            System.out.println("---Enter the marks obtained in each subjects(out of 100):---");
            int[] subjectmarks = new int[totalsubjects];
            for (int i = 0; i < totalsubjects; i++) {
                System.out.println("...enter marks for subject.." + (i + 1));
                subjectmarks[i] = scanner.nextInt();
                if (subjectmarks[i] < 0 || subjectmarks[i] > 100) {
                    System.out.println("Invalid input! marks should be greater than and less than 100");
                    return;
                }
                totalmarks += subjectmarks[i];
            }
            double averagepercentage = (double) totalmarks / (totalsubjects * 100) * 100;
            char grade;
            if (averagepercentage >= 90) {
                grade = 'A';
            } else if (averagepercentage >= 80) {
                grade = 'B';
            } else if (averagepercentage >= 70) {
                grade = 'C';
            } else if (averagepercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }
            System.out.println(".....RESULTS.......");
            System.out.println("**Total marks:** are " + "  " + totalmarks);
            System.out.println("Averagepercentage is ---" + averagepercentage);
            System.out.println("Grade:" + " is" + " " + grade);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter the valid input");

        }

    }
}