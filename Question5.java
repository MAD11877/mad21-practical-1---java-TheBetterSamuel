import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    System.out.print("Enter a number: ");
    Scanner n = new Scanner(System.in);
    int num = n.nextInt();
    System.out.println("Enter " + num + " numbers and hit enter after each number.");
    int[] digits = new int[num];
    int lim = 0;
    do{
      System.out.print("Enter a number: ");
      Scanner di = new Scanner(System.in);
      int digi = di.nextInt();
      digits[lim] = digi;
      lim++;
    }while(lim < num);
    int mode = 0;
    int maxOccurance = 0;
    for(int j=0; j<digits.length; j++){
        int occurance = 0;
        for(int k=0; k<digits.length; k++){
            if(digits[j] == digits[k])
              occurance++;
        }

        if(occurance > maxOccurance){
            maxOccurance = occurance;
            mode = digits[j];
        }
    }
    System.out.println("The modal number is " + mode);
  }
 
}
git add .
git addfgit add .