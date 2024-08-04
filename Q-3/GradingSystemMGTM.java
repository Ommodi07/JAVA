import java.util.Scanner;
import Student_pack.Student;
import Grade_pack.Grade;
import GradingSystem_pack.GradingSystem;


public class GradingSystemMGTM {
    public static void main(String[] args) {
        GradingSystem gradingSystem = new GradingSystem();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Grading System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course Credits");
            System.out.println("3. Add Grade");
            System.out.println("4. Calculate CGPA");
            System.out.println("5. Print Grade Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentID = sc.nextInt();
                    sc.nextLine();  
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    gradingSystem.addStudent(new Student(studentID, name));
                    break;

                case 2:
                    System.out.print("Enter course ID: ");
                    int courseID = sc.nextInt();
                    System.out.print("Enter course credits: ");
                    int credits = sc.nextInt();
                    gradingSystem.addCourseCredits(courseID, credits);
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Enter course ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Enter grade (A-F): ");
                    char grade = sc.next().charAt(0);
                    gradingSystem.addGrade(new Grade(sid, cid, grade));
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    int gpaStudentID = sc.nextInt();
                    double gpa = gradingSystem.calculateCGPA(gpaStudentID);
                    System.out.println("CGPA for student ID " + gpaStudentID + ": " + gpa);
                    break;

                case 5:
                    System.out.print("Enter student ID: ");
                    int reportStudentID = sc.nextInt();
                    gradingSystem.Report(reportStudentID);
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input.");
                    break;
            }
            System.out.println();
        }
    }
}

