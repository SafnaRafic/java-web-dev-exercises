package org.launchcode.java.studios.FunWithQuizz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        ArrayList<MultipleChoice> multipleChoices = new ArrayList<>();
        ArrayList<Checkbox> checkboxes = new ArrayList<>();
        ArrayList<TrueOrFalse> trueOrFalse = new ArrayList<>();

        Quiz quiz=new Quiz();
        //Question 1
        System.out.println("1. What type of Inheritance does Java have?");
        System.out.println("" +
                "   a. Single Inheritance\n" +
                "   b. Double Inheritance\n" +
                "   c. Multiple Inheritance\n" +
                "   d. Class Inheritance");
        String ans1=input.nextLine();
        quiz.addQuestionAnswer(multipleChoices.get(0),ans1);

        //Question 2
        System.out.println("2. What restriction is there on using the super reference in a constructor?");
        System.out.println("" +
                "   a. It can only be used in the parent's constructor.\n" +
                "   b. Only one child class can use it.\n" +
                "   c. It must be used in the last statement of the constructor.\n" +
                "   d. It must be used in the first statement of the constructor.");
        String ans2=input.nextLine();
        quiz.addQuestionAnswer(multipleChoices.get(1),ans2);

        //Question3
        System.out.println("3. Subclass inherit both member variables and methods?");
        System.out.println("True\nFalse");
        String ans3=input.nextLine();
        quiz.addQuestionAnswer(trueOrFalse.get(0),ans3);

        //Question4
        System.out.println("4. Why use Inheritance in java?");
        System.out.println("" +
                "   Code ReUsability\n"+
                "   Only one child can use it\n"+
                "   For Method overriding\n"+
                "   It can inherit multiple classes");
        String ans4=input.nextLine();
        quiz.addQuestionAnswer(checkboxes.get(0),ans4);
//        String[] selections={"Code ReUsability","For Method Overriding"};
//        quiz.addQuestionAnswer(checkboxes.get(0),checkboxes.get(0).hashcode(selections));

        System.out.println("Total Answers Correct: "+quiz.getScore());
    }

}
