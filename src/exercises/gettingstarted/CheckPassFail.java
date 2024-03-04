package exercises.gettingstarted;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckPassFail {
        /* Write a program called CheckPassFail which prints "PASS"
            if the int variable "mark"
            is more than or equal to 50; or prints "FAIL" otherwise.
            The program shall always print “DONE” before exiting. */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the variable 'mark': ");

        try{
            int mark = scanner.nextInt();
            if (mark >= 50) {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Erro de entrada: " + e.getMessage());
        }
        finally{
            System.out.println("DONE");
        }
    }
}
