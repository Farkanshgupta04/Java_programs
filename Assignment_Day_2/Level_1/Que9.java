package Assignment_Day_2.Level_1;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
       
    }

}
