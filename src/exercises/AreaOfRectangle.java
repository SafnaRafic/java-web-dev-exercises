package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double length;
        double width;
        double area;
        System.out.print("Enter the Rectangle length: ");
        length = in.nextDouble();
        System.out.print("Enter the Rectangle width: ");
        width = in.nextDouble();
        area = length * width;
        System.out.println("Area of the rectangle is: " + area);
    }
}

