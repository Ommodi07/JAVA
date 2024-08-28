package Course_pack;
import Course_pack.Course;

public class Enrollment {
    private int studentCourses[][];
    private int[] count;

    public Enrollment(int numStudents, int numCourses) {
        studentCourses = new int[numStudents][numCourses];
        count = new int[numStudents];
    }

    public void enroll(int studentID, int courseID)
    {
        if(count[studentID]<studentCourses[studentID].length)
        {
            studentCourses[studentID][count[studentID]++] = courseID;
            System.out.println("Student " + studentID + " enrolled in Course " + courseID);
        }
        else
        {
            System.out.println("Student " + studentID + " cannot enroll in more courses.");
        }
    }

    public void drop(int studentID, int courseID)
    {
        boolean found = false;
        for(int i=0;i<count[studentID];i++)
        {
            if (studentCourses[studentID][i]==courseID)
            {
                found = true;
                for(int j=i;j<count[studentID]-1;j++)
                {
                    studentCourses[studentID][j] = studentCourses[studentID][j+1];
                }
                count[studentID]--;
                System.out.println("Student " + studentID + " dropped Course " + courseID);
                break;
            }
        }
        if(!found)
        {
            System.out.println("Course " + courseID + " not found for Student " + studentID);
        }
    }
    
    public void getEnrolledCourses(int studentID, Course[] courseCatalog)
    {
        System.out.println("Enrolled courses for Student " + studentID + ":");
        for(int i=0;i<count[studentID];i++)
        {
            int courseID = studentCourses[studentID][i];
            for(Course course : courseCatalog)
            {
                if(course.getCourseID()==courseID)
                {
                    System.out.println(course);
                }
            }
        }
    }
}
