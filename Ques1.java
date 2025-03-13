/*1. 
 Write a java program to take input as a command line argument.Your name,course,universityrollno and semester.
 Display the information.
 Name:
 UniversityRollNo:
 Course:
 Semester:
*/

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name = ip.nextLine();
        System.out.print("Enter your UniversityRollNo.: ");
        int UniversityRollNo = ip.nextInt();
        System.out.print("Enter your Course: ");
        String Course = ip.next();
        System.out.print("Enter your Semestr: ");
        int Semester = ip.nextInt();
        System.out.println("Your Details: ");
        System.out.println("Name: " + Name);
        System.out.println("University Roll No.: " + UniversityRollNo);
        System.out.println("Course: " + Course);
        System.out.println("Semester: " + Semester);
    }
}
