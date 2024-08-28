import Course_pack.Course;
import Course_pack.Enrollment;

public class CourseEnrollment {
    public static void main(String[] args) {
        Course[] courseCatalog = {
            new Course(101, "Mathematics", 4),
            new Course(102, "Physics", 3),
            new Course(103, "Computer Science", 5),
            new Course(104, "Chemistry", 4)
        };

        Enrollment enrollment = new Enrollment(5, 10);

        enrollment.enroll(0, 101);
        enrollment.enroll(0, 103);
        enrollment.enroll(1, 102);
        enrollment.enroll(1, 104);

        enrollment.getEnrolledCourses(0, courseCatalog);
        enrollment.getEnrolledCourses(1, courseCatalog);

        enrollment.drop(0, 103);
        enrollment.getEnrolledCourses(0, courseCatalog);
    }
}
