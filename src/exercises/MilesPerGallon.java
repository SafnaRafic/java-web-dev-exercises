package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of miles you have driven: ");
        double numOfMiles=input.nextDouble();
        System.out.println("Enter the amount of gas(in gallons) consumed: ");
        double gas=input.nextDouble();

        double milesPerGallon=numOfMiles/gas;
        System.out.println("Miles per gallon is "+milesPerGallon);
    }
}
