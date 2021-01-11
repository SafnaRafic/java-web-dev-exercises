package exercises.ch3ControlFlowExecution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayPractice arrayPractice=new ArrayPractice();
        String[] returnedWords = arrayPractice.splitBySpace();

    //  Declaring ArrayList to find sum of all even numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 7, 14, 34, 12, 31, 1, 38, 61, 99));
        System.out.println("Sum of even numbers : "+sumOfEvenNum(numbers));

    //  Declaring ArrayList to get the word with particular length
    //  ArrayList<String> words= new ArrayList<>(Arrays.asList("Dog","Hello","Cat","Tamil","Loves"));
        ArrayList<String> words= new ArrayList<>(Arrays.asList(returnedWords));
        System.out.println("What word length are you looking for ? ");
        int searchLength = getUserInput();
        printWordsWithFiveLetters(words,searchLength);
    }

    public static Integer sumOfEvenNum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2 == 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }

    public static void printWordsWithFiveLetters(ArrayList<String> words,int searchLength){
        for(int i=0;i<words.size();i++){
            if(words.get(i).length() == searchLength){
                System.out.println(words.get(i));
            }
        }
    }

    public static int getUserInput(){
        Scanner input = new Scanner(System.in);
        int searchInt = input.nextInt();
        return searchInt;
    }
}

//        My old program
//        Scanner input=new Scanner(System.in);
//        int number;
//            numbers.add(5);
//            numbers.add(7);
//            numbers.add(14);
//            numbers.add(34);
//            numbers.add(12);
//            numbers.add(31);
//            numbers.add(1);
//            numbers.add(38);
//            numbers.add(61);
//            numbers.add(99);

//        System.out.println(numbers);
//        String str="Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.";
//        String[] str1=str.split(" ");
//        System.out.println("Enter the word length for search: ");
//        int length=input.nextInt();
//
//        for(int i=0;i<str1.length;i++){
//            if(str1[i].length() == length){
//                System.out.println(str1[i]);
//            }
//        }
//    }

//}
