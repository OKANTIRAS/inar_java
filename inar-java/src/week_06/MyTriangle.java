package week_06;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        double area = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextInt();
        double side2 = input.nextInt();
        double side3 = input.nextInt();
        if (isValid(side1, side2, side3)) {
            area = area(side1,side2,side3);
            System.out.printf("The area of the triangle is %.1f",area);
        }else{
            System.out.println("Invalid input");
        }
    }
    public static boolean isValid(double side1, double side2, double side3){
        if(((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)){
            return true;
        }else{
            return false;
        }
    }
    public static double area(double side1, double side2, double side3){
       double s = (side1 + side2 + side3) / 2;
       double area = Math.sqrt(s * (s - side1) * (s - side2) * (s- side3));
       return area;
    }
}
