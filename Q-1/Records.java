package Records_pack;
import Student_pack.Student;

public class Records {
    private static int count;
    private Student[] students = new Student[10];
    private boolean b;
    static 
    {
        count=0;
    }

    public void addStudent(int studentId, String name, int age, String dep) {
        if(count < students.length) 
        {
            students[count] = new Student(studentId, name, age, dep);
            count++;
        }else 
        {
            System.out.println("Cannot add more students. Records are full.");
        }
    }
    public Student getStudents(int Student_id)
    {
        for(int i=0;i<count;i++)
        {
            if(students[i].getStudentId() == Student_id)
            {
                return students[i];
            }
        }
        return null;
    }

    public boolean getStudentsbydep(String dep)
    {
        b = false;
        for(int i=0;i<count;i++)
        {
            if(dep.equals(students[i].getStudentDep()))
            {
                System.out.println(students[i]);
                b = true;
            }
        }
        return b;
    }

    public void DisplayAll()
    {
        for(int i=0;i<count;i++) 
        {
            System.out.println(students[i]);
        }
    }
}
