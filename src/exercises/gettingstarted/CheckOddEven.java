package exercises.gettingstarted;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckOddEven {
    /* Write a program called CheckOddEven which prints "Odd Number" if
    the int variable “number” is odd, or “Even Number” otherwise.
    The program shall always print “bye!” before exiting.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.println("Enter the number to be checked: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("Odd number.");
        } else {
            System.out.println("Even number.");
        }
        }
        catch(InputMismatchException e){
            System.out.println("Input error: " + e.getMessage());
        }
        finally{
            System.out.println("bye!");
        }
    }
}