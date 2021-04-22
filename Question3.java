import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    System.out.print("Enter a number: ");
    Scanner n = new Scanner(System.in);
    int num = n.nextInt();
    System.out.println("Result: " + (num * num));
  }
}
