package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(10);
        Scanner input=new Scanner(System.in);
        int number;
            numbers.add(5);
            numbers.add(7);
            numbers.add(14);
            numbers.add(34);
            numbers.add(12);
            numbers.add(31);
            numbers.add(1);
            numbers.add(38);
            numbers.add(61);
            numbers.add(99);

//        for(int i=0;i<10;i++){
//            System.out.println("Enter a number: ");
//            number=input.nextInt();
//            numbers.add(number);
//        }
        System.out.println(numbers);
        String str="Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.";
        String[] str1=str.split(" ");
        System.out.println("Enter the word length for search: ");
        int length=input.nextInt();

        for(int i=0;i<str1.length;i++){
            if(str1[i].length() == length){
                System.out.println(str1[i]);
            }
        }
    }
}
//System.out.println("Oops ! No "+length+ " letter words in String");