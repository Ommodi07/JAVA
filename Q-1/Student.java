package Student_pack;

public class Student{
    private int Student_id;
    private String name;
    private int age;
    private String dep;

    public Student(int Student_id,String name,int age,String dep)
    {
        this.Student_id=Student_id;
        this.name=name;
        this.age=age;
        this.dep=dep;
    }

    public int getStudentId()
    {
        return Student_id;
    }
    public String getStudentName()
    {
        return name;
    }
    public int getStudentAge()
    {
        return age;
    }
    public String getStudentDep()
    {
        return dep; 
    }
    public String toString()
    {
        return "Student ID     :" + Student_id 
        +"\n"+ "Student Name   :" + name 
        +"\n"+ "Age            :" + age 
        +"\n"+ "Department     :" + dep + "\n"; 
    }
}
