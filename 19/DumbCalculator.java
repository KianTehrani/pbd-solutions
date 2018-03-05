import java.util.Scanner;
public class DumbCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your first number? ");
        double firstnum = input.nextDouble();
        
        System.out.print("What is your second number? ");
        double secondnum = input.nextDouble();
        
        System.out.print("What is your third number? ");
        double thirdnum = input.nextDouble(); 
        
        System.out.println("(" + firstnum + " + " + secondnum + " + " + thirdnum + ") / 2 is... " + (firstnum + secondnum + thirdnum) / 2); }
}
