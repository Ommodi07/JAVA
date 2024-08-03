Assignment Question of java programming


Q-1) Managing Student Records
Objective:  To design and implement a system for storing and retrieving student records.
Create a Student class that includes data members such as student ID, name, age, and department.
Implement methods to add new student records, view existing records, and search for a student by their ID.
Write a program that allows users to interact with the system, adding new student records and retrieving information as needed.
+-------------------------+
|       Student          |
+------------------------+
| - studentID: int       |
| - name: String         |
| - age: int             |
| - department: String   |
+-----------------------------+
| + getStudentID(): int  |
| + getName(): String    |
| + getAge(): int        |
| + getDepartment(): String |
| + toString(): String   |
+-----------------------------+


+----------------------------------------+
|       StudentRecordMGMT        |
+----------------------------------------+
|                                                      |
+----------------------------------------+
| + main(args: String[]): void |
+----------------------------------------+


+------------------------------------+
|    StudentRecordSystem     |
+------------------------------------+
| - students: Student[]      |
| - count: int               |
+---------------------------------------------------+
| + addStudent(student: Student): void |
| + getStudent(studentID: int): Student |
| + displayAllStudents(): void          |
+---------------------------------------------------+


Q-2) Course Enrollment System:
Objective: To develop a system for managing student course enrollments.
Create a Course class with data members such as course ID, course name, and credits.
Create an Enrollment class that links students to courses and records their enrollment status.
Implement methods to enroll a student in a course, drop a course, and view all courses a student is enrolled in.
Write a program that allows users to enroll students in courses and view their enrollments.

+------------------------------------+
|         Course            |
+------------------------------------+
| - courseID: int           |
| - courseName: String      |
| - credits: int            |
+------------------------------------+
| + getCourseID(): int      |
| + getCourseName(): String |
| + getCredits(): int       |
| + toString(): String      |
+------------------------------------+


+------------------------------------+
|       CourseEnrollement        |
+------------------------------------+
| - courseCatalog: Course[] |
| - enrollment: Enrollment  |
+------------------------------------+
| + main(args: String[]): void |
+------------------------------------+


+------------------------------------------------------+
|        Enrollment         |
+-------------------------------------------------------+
| - studentCourses: int[][] |
| - count: int[]            |
+--------------------------------------------------------+
| + enroll(studentID: int, courseID: int): void |
| + drop(studentID: int, courseID: int): void   |
| + getEnrolledCourses(studentID: int, courseCatalog: Course[]): void |
+----------------------------------------------------------+


Q-3) Grading and Result Declaration System 
Objective: To design a system for recording and calculating student grades.
Create a Student class to store student information.
Create a Grade class to store information about grades, including student ID, course ID, and grade received.
Implement methods to add grades for students, calculate GPA, and generate grade reports.
Write a program that allows users to input grades for students, calculate their GPA, and print their grade reports.

+---------------------------+
|         Student           |
+---------------------------+
| - studentID: int          |
| - name: String            |
+---------------------------+
| + getStudentID(): int     |
| + getName(): String       |
+---------------------------+


+---------------------------+
|         Grade             |
+---------------------------+
| - studentID: int          |
| - courseID: int           |
| - grade: char             |
+---------------------------+
| + getStudentID(): int     |
| + getCourseID(): int      |
| + getGrade(): char        |
+---------------------------+


+---------------------------+
|      GradingSystem        |
+---------------------------+
| - students: Student[]     |
| - grades: Grade[]         |
| - courseCredits: int[]    |
| - studentCount: int       |
| - gradeCount: int         |
+---------------------------+
| + addStudent(student: Student): void |
| + addGrade(grade: Grade): void       |
| + addCourseCredits(courseID: int, credits: int): void |
| + calculateGPA(studentID: int): double |
| - gradeToPoints(grade: char): int     |
+---------------------------+


+------------------------------------+
| GradingSystemMGTM        |
+------------------------------------+
|                   |
+------------------------------------+
| + main(args: String[]): void |
+------------------------------------+

