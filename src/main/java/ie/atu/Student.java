package ie.atu;


public class Student
{

    int studentCount = 1;
    String name;
    String studentEmail;
    String studentCourse;

    public Student()
    {
        this.name = "";
        this.studentEmail = "";
        this.studentCourse = "";
    }

    public Student(String name, String studentEmail, String studentCourse) {
        this.name = name;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }

    public Student(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public void display()
    {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getStudentEmail());
        System.out.println("Course: " + getStudentCourse() + "\n");
    }
}
