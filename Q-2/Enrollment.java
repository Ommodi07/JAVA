package Enrollment_pack;
import Course_pack.Course;

public class Enrollment {
    private int studentCourses[][];
    private int[] count;


    public void enroll(int Student_id,int Course_id)
    {
        studentCourses[Student_id][count[Student_id]] = Course_id;
        count[Student_id]++;
    }
    public void drop(int Student_id,int Course_id)
    {
        for(int i=0;i<count[Student_id];i++)
        {
            if(studentCourses[Student_id][i]==Course_id)
            {
                for(int j=i;j<count[Student_id]-1;j++)
                {
                    studentCourses[Student_id][j]=studentCourses[Student_id][j+1];
                    count[Student_id]--;
                    return;
                }
            }
        }
    }
    public void getEnrolledCourses(int Student_id,Course[] CourseCatalog)
    {
        for(int i=0;i<count[Student_id];i++)
        {
            for(int j=0;j<CourseCatalog.length;j++)
            {
                if(studentCourses[Student_id][i]==CourseCatalog[j].getCourseID())
                {
                    System.out.println(CourseCatalog[j].getCourseName());
                }
            }
        }
    }
}
