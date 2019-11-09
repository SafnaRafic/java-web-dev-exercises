package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static double getArea(double radius){
        double PI= PiRandonNumber.getPI();
        double area= PI *radius *radius;
        return area;
    }
}
