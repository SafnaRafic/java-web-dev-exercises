package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Rectangle length: ");
        double length = in.nextDouble();
        System.out.print("Enter the Rectangle width: ");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle is: " + area);
    }
}

