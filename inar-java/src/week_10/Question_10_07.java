package week_10;

import week_09.Account;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account(i, 100);
            accounts[i] = account;
        }

        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            if (id > 9 || id < 0) {
                System.out.println("Wrong id try again!");
                continue;
            }
            while (true) {
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("3: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } else if (choice == 2) {
                    double amount = input.nextDouble();
                    accounts[id].withdraw(amount);
                } else if (choice == 3) {
                    double amount = input.nextDouble();
                    accounts[id].deposit(amount);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Wrong choice try again!");

                }
            }

        }
    }
}
