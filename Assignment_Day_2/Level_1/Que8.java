package Assignment_Day_2.Level_1;

import java.util.Scanner;

public class Que8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }

}
