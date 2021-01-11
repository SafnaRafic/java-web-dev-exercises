package exercises.ch3ControlFlowExecution;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice arrObj = new ArrayPractice();

    //  Declaring array of numbers to find odd numbers
        int[] numbers = {1, 1, 2, 3, 5, 8};
        System.out.println("Odd numbers are: " );
        arrObj.oddNumbers(numbers);

    //  Split the word by space and period
        System.out.println("Split by space: \n"+Arrays.toString(arrObj.splitBySpace()));
        System.out.println("Split by period: \n"+Arrays.toString(arrObj.splitByPeriodArray()));
    }

    public void oddNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public String[] splitBySpace() {
        String myProvidedString="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] newSplitString = myProvidedString.split(" ");
        return newSplitString;
    }
    public String[] splitByPeriodArray(){
        String myProvidedString="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] splitByPeriodArray = myProvidedString .split("\\.");
        return splitByPeriodArray;
//      System.out.println(Arrays.toString(splitByPeriodArray));
    }
}
