package ie.atu;

import java.util.Scanner;

public class Student
{

    String firstName;
    String lastName;
    String studentEmail;
    String studentCourse;

    public Student(){
        this.firstName = "";
        this.lastName = "";
        this.studentEmail = "";
        this.studentCourse = "";
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter your email: ");
        this.studentEmail = scanner.nextLine();

        System.out.print("Enter your course: ");
        this.studentCourse = scanner.nextLine();
    }

    public void display()
    {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + studentEmail);
        System.out.println("Course: " + studentCourse);
    }


}
