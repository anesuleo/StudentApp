package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //First Student
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();

        System.out.println("Student 1, Please enter your details: ");
        System.out.print("Enter your name: ");
        student1.setName(scanner.nextLine());
        System.out.print("Enter your email: ");
        student1.setStudentEmail(scanner.nextLine());
        System.out.print("Enter your course: ");
        student1.setStudentCourse(scanner.nextLine());
        System.out.println("\n");

        //Second Student

        System.out.println("Student 2, Please enter your details: ");
        System.out.println("Enter your name: ");
        String name2 = scanner.nextLine();

        Student student2 = new Student(name2);

        System.out.println("Enter your email: ");
        student2.setStudentEmail(scanner.nextLine());
        System.out.println("Enter your course: ");
        student2.setStudentCourse(scanner.nextLine());
        System.out.println("\n");

        //Third Student
        System.out.println("Student 3, Please enter your details: ");
        System.out.print("Enter your name: ");
        String name3 = scanner.nextLine();
        System.out.println("Enter your email: ");
        String email3 = scanner.nextLine();
        System.out.println("Enter your course: ");
        String course3 = scanner.nextLine();
        System.out.println("\n");
        Student student3 = new Student(name3, email3, course3);

        //Information display for all 3 students
        System.out.println("Student 1 your details are...");
        student1.display();
        System.out.println("Student 2 your details are...");
        student2.display();
        System.out.println("Student 3 your details are...");
        student3.display();
    }
}
