package studentDataBaseApp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
        System.out.println("Enter number of students to enroll: ");

        Scanner in = new Scanner(System.in);
        int studNumber = in.nextInt();
        Student[] students = new Student[studNumber];

        for(int n = 0; n < studNumber; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n]);
        }                                                              
    }
}
