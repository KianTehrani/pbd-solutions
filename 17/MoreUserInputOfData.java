import java.util.Scanner;
public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstname;
        String lastname;
        int grade;
        int id;
        String login;
        double gpa;
        
        System.out.println("Please enter the folling information so I can sell it for profit!");
        
        System.out.print("First name: ");
        firstname = keyboard.next();
        System.out.print("Last name: ");
        lastname = keyboard.next();
        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        id = keyboard.nextInt();
        System.out.print("Login: ");
        login = keyboard.next();
        System.out.print("GPA (0.0-4.0): ");
        gpa = keyboard.nextDouble();
        
        System.out.println("Your information:");
            System.out.println("Login: " + login);
            System.out.println("ID: " + id);
            System.out.println("Name: " + lastname + ", " + firstname);
            System.out.println("GPA: " + gpa);
            System.out.println("Grade: " + grade); }  
}            
