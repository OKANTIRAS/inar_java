package week_05;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:  ");
        int year = input.nextInt();

        System.out.println("Enter the first day of the year: ");
        int firstDayOfTheYear = input.nextInt();

        int numberOfMonthDays = 0;
        int startDayOfMonth = 0;
        String nameOfMonth = "";
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        }

        for (int i = 1; i <= 12; i++) {

            switch (i) {

                case 1:
                    nameOfMonth = "January";
                    numberOfMonthDays = 31;
                    startDayOfMonth = firstDayOfTheYear;
                    break;

                case 2:
                    nameOfMonth = "February";
                    numberOfMonthDays = (isLeapYear) ? 29 : 28;
                    startDayOfMonth = (firstDayOfTheYear + 31) % 7;
                    break;
                case 3:
                    nameOfMonth = "March";
                    numberOfMonthDays = 31;
                    startDayOfMonth = (isLeapYear) ? (startDayOfMonth + 29) % 7 : (startDayOfMonth + 28) % 7;
                    break;
                case 4:
                    nameOfMonth = "April";
                    numberOfMonthDays = 30;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 5:
                    nameOfMonth = "May";
                    numberOfMonthDays = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
                case 6:
                    nameOfMonth = "June";
                    numberOfMonthDays = 30;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 7:
                    nameOfMonth = "July";
                    numberOfMonthDays = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
                case 8:
                    nameOfMonth = "August";
                    numberOfMonthDays = 31;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 9:
                    nameOfMonth = "September";
                    numberOfMonthDays = 30;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
                case 10:
                    nameOfMonth = "October";
                    numberOfMonthDays = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
                case 11:
                    nameOfMonth = "November";
                    numberOfMonthDays = 30;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 12:
                    nameOfMonth = "December";
                    numberOfMonthDays = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;


            }
            System.out.println(nameOfMonth + "  " + year );
            System.out.print("-----------------------------------------------\n");
            System.out.printf("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");

            if(startDayOfMonth % 7 == 1){
                System.out.print("1\t");

            }else if(startDayOfMonth % 7 ==2){
                System.out.print("\t1\t");
            }else if(startDayOfMonth % 7 ==3){
                System.out.print("\t\t1\t");
            }else if(startDayOfMonth % 7 ==4){
                System.out.print("\t\t\t1\t");
            }else if(startDayOfMonth % 7 ==5){
                System.out.print("\t\t\t\t1\t");
            }else if(startDayOfMonth % 7 ==6) {
                System.out.print("\t\t\t\t\t1\t");
            }else{
                System.out.print("\t\t\t\t\t\t1\t");
            }

            for(int j = 2; j <= numberOfMonthDays; j++){
                System.out.print(((startDayOfMonth - 2 + j) % 7 == 0) ? "\n" + j + "\t" : j + "\t");
            }
            System.out.println("\n");



        }
    }
}