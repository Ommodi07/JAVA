package Course_pack;

public class Course{
    private int Course_id;
    private String Course_name;
    private int Credits;

    public Course(int id, String name, int credits)
    {
        Course_id = id;
        Course_name = name;
        Credits = credits;
    }
    
    public int getCourseID()
    {
        return Course_id;
    }

    public String getCourseName()
    {
        return Course_name;
    }

    public int getCreadits()
    {
        return Credits;
    }

    public String toString()
    {
        return "Course ID     :" + Course_id +
                "\nCourse Name :" + Course_name + 
                "\nCredits     :" + Credits;
    }
}