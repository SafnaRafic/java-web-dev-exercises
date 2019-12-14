package org.launchcode.java.studios.FunWithQuizz;

import java.util.HashMap;

public class MultipleChoice extends Question {

    //fields
    private String actualAnswer;
    private HashMap<String,String> multipleChoice=new HashMap<>();
    //constructor to call base constructor
    public MultipleChoice(String question) {
        super(question);
    }

    //getter and setter for 2 fields
    public String getActualAnswer() {
        return actualAnswer;
    }

    public void setActualAnswer(String actualAnswer) {
        this.actualAnswer = actualAnswer;
    }

    public HashMap<String, String> getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(HashMap<String, String> multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    // Methods
    public void addMultipleChoice(String option,String choice){
        multipleChoice.put(option,choice);
    }
    //toString


    @Override
    public String toString() {
        return question;
    }
}
