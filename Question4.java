import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    System.out.print("Enter a number: ");
    Scanner n = new Scanner(System.in);
    int num = n.nextInt();
    while(num >= 1){
      int i = 0;
      do{
        System.out.print("*");
        i++;
      }while(i < num);
      num--;
      System.out.println();
    }
  }
}
