package week_07;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");

        int [] numbers = new int [10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }

    }
}
