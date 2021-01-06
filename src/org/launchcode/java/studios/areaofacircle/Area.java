package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius=0.0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
        }while(radius<=0 );
        double circle = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+radius+ " is: "+circle);
    }
}
