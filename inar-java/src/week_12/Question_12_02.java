package week_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum: ");
        boolean isTrue = true;
        while (isTrue){
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println("Sum of " + number2 + " + " + number2 + " is " + (number1 + number2));
                isTrue = false;

            }catch (InputMismatchException ex){
                System.out.println(ex);
                System.out.println("Wrong input !! Please enter integer -->");
                input.nextLine();

            }
        }

    }
}
