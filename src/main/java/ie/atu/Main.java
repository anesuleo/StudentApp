package ie.atu;

import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        //First Student with Getters
        Student student1 = new Student();

        student1.getUserInput();

        System.out.println("Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Email: " + student1.getStudentEmail());
        System.out.println("Course: " + student1.getStudentCourse());

        //Second Student with Default Constructor
        
    }
}