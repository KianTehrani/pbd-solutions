import java.util.Scanner;
public class HowOldAreYou {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int drink = 19;
    int drive = 16;
    
    System.out.print("Hey, What's your name? ");
    String name = input.next();
    
    System.out.print("Ok, " + name + ", how old are you? ");
    int age = input.nextInt();
    
    if (age < drive) {
      System.out.println("Sorry! You can't drive.");
    }
    
    if (age >= drive) {
      System.out.println("Cool! You can drive. Wanna race?");
    }
    
    if (age >= drink) {
      System.out.println("Nice! You can drink."); }
    }
}
