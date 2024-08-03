import Records_pack.Records;
import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class MainPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Records R = new Records();
        int id=0,age=0;
        String name,dep;
        while(choice!=5)
        {
            System.out.println("1) to add new student. ");
            System.out.println("2) to retrive information by id. ");
            System.out.println("3) to search by department. ");
            System.out.println("4) to display all student details. ");
            System.out.println("5) to exit. ");
            System.out.print("Enter your choice :");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the student id : ");
                    id = sc.nextInt();
                    System.out.print("Enter the name : ");
                    name = sc.next();
                    System.out.print("Enter age : ");
                    age = sc.nextInt();
                    System.out.print("Enter the Department : ");
                    dep = sc.next();
                    R.addStudent(id,name,age,dep);
                    break;

                case 2:
                    System.out.print("Enter the id of the student : ");
                    id = sc.nextInt();
                    System.out.println(R.getStudents(id));
                    break;

                case 3:
                    System.out.print("Enter the course name : ");
                    dep = sc.next();
                    if(!R.getStudentsbydep(dep))
                    {
                        System.out.println("No student found");
                    }
                    break;
                
                case 4:
                    System.out.println("Details of all students!!!!");
                    R.DisplayAll();
                    break;
                
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
