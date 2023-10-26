package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //First Student with Getters
        Student student1 = new Student();

        student1.getUserInput();

        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Email: " + student1.getStudentEmail());
        System.out.println("Course: " + student1.getStudentCourse());

        //Second Student with Default Constructor and Setters
        Scanner scanner = new Scanner(System.in);

        Student student2 = new Student();
        System.out.println("Enter your first name: ");
        student2.setFirstName(scanner.nextLine());
        System.out.println("Enter your last name: ");
        student2.setLastName(scanner.nextLine());
        System.out.println("Enter your email: ");
        student2.setStudentEmail(scanner.nextLine());
        System.out.println("Enter your course: ");
        student2.setStudentCourse(scanner.nextLine());

        student2.display();



    }
}