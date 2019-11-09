package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        DO WHILE LOOP

        double radius;
        do {
            System.out.println("Enter the radius of circle: ");
            if(input.hasNextDouble()) {
                radius = input.nextDouble();
            } else {
                radius = -1.0;
                System.out.println("Oops ! It should be a number ");
                input.next();
            }
        } while(radius < 0);
        double area = Circle.getArea(radius);
        System.out.println("Area of Circle is " + area);
        input.close();

        }

    }

//    WHILE LOOP

//        double radius=-1;
//        while(radius<0) {
//            System.out.println("Enter the radius of circle: ");
//            if(input.hasNextDouble()) {
//                radius = input.nextDouble();
//            }
//            input.nextLine();
//
//        }
//        double area = Circle.getArea(radius);
//        System.out.println("Area of Circle is " + area);
//        input.close();
