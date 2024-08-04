package GradingSystem_pack;

import Student_pack.Student;
import Grade_pack.Grade;

public class GradingSystem {
    private Student[] students = new Student[10];
    private Grade[] grades = new Grade[10];
    private int[] courseIDs = new int[10];
    private int[] courseCredits = new int[10];
    private int studentCount = 0;
    private int gradeCount = 0;
    private int courseCount = 0;

    public void addStudent(Student student)
    {
        students[studentCount] = student;
        studentCount++;
    }

    public void addGrade(Grade grade) 
    {
        grades[gradeCount] = grade;
        gradeCount++;
    }

    public void addCourseCredits(int courseID, int credits) 
    {
        for(int i=0; i<courseCount;i++) 
        {
            if(courseIDs[i]==courseID) 
            {
                courseCredits[i] = credits;
                return;
            }
        }
        if(courseCount>=courseIDs.length) 
        {
            System.out.println("Cannot add course: Maximum limit of courses reached.");
            return;
        }
        courseIDs[courseCount] = courseID;
        courseCredits[courseCount++] = credits;
    }

    public double calculateCGPA(int studentID) 
    {
        double cgpa = 0;
        double tcreadits = 0;

        for(int i=0;i<gradeCount;i++)
        {
            if (grades[i].getStudentID() == studentID)
            {
                int credits = getCourseCredits(grades[i].getCourseID());
                cgpa += gradeToPoints(grades[i].getGrade())*credits;
                tcreadits += credits;
            }
        }
        return cgpa/tcreadits;
    }

    private int getCourseCredits(int courseID)
    {
        for(int i=0;i<courseCount;i++)
        {
            if(courseIDs[i]==courseID)
            {
                return courseCredits[i];
            }
        }
        return 0;
    }

    private int gradeToPoints(char grade)
    {
        switch (grade)
        {
            case 'A': return 10;
            case 'B': return 9;
            case 'C': return 8;
            case 'D': return 7;
            case 'E': return 6;
            case 'F': return 0;
            default: return 0;
        }
    }

    public void Report(int studentID)
    {
        for (int i=0;i<studentCount;i++)
        {
            if(students[i].getStudentID()==studentID)
            {
                System.out.println("Grade report for " + students[i].getName() + ":");
                break;
            }
        }
        System.out.printf("Course ID  Grade\n");
        for(int i=0;i<gradeCount;i++)
        {
            if(grades[i].getStudentID()==studentID)
            {
                System.out.println(grades[i].getCourseID() + "          " + grades[i].getGrade());
            }
        }
        System.out.println("CGPA: " + calculateCGPA(studentID));
    }
}
