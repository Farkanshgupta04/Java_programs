package Assignment_Day_1;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

      
        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);

    }
}
