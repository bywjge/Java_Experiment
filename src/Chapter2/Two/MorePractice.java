package Chapter2.Two;

import java.util.Scanner;

public class MorePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;
        double area;
        System.out.println("Please enter the width of the rectangle:");
        width = scanner.nextDouble();
        System.out.println("Please enter the height of the rectangle:");
        height = scanner.nextDouble();
        System.out.println("Width of the rectangle:" + width);
        System.out.println("Height of the rectangle:" + height);
        area = width*height;
        System.out.println("Area of rectangle: " + area);
    }
}
