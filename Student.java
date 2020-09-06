package studentDataBaseApp;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();


        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter class level: ");
        this.gradeYear = in.nextInt();

        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " StudId: " + studentID);
    }

    private void setStudentId() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        String course = "";
        while(!course.equals("Q")) {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);

            course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            System.out.println("Enrolled in: " + courses);
        }
    }

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int pay = in.nextInt();
        tuitionBalance = tuitionBalance - pay;
        System.out.println("Thank you for you payment of: $" + pay);
        viewBalance();
    }
}
