import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     System.out.print("Enter your height in m: ");
    Scanner h = new Scanner(System.in);
    double height = h.nextDouble();
    System.out.print("Enter your weight in kg: ");
    Scanner w = new Scanner(System.in);
    double weight = w.nextDouble();
    System.out.println("Your height is: " + height + "m");
    System.out.println("Your weight is: " + weight + "kg");
  }
}
