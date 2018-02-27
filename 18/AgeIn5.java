import java.util.Scanner;
class AgeIn5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Hello. What is your name? ");
      String name = input.next();
      
      System.out.print("Hi, " + name + "! How old are you? ");
      int age = input.nextInt();
      
      System.out.println("Did you know that in five years you will be " + (age + 5) + " years old? And five years ago you were " + (age - 5) + "! Imagine that!"); }
      
}
