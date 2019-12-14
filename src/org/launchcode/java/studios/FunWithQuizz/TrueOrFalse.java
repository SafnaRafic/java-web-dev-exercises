package org.launchcode.java.studios.FunWithQuizz;

public class TrueOrFalse extends Question {

    //field
    private String actualAnswer;

    //constructor to call super constructor
    public TrueOrFalse(String question) {
        super(question);
    }

    //getter and setter

    public String getActualAnswer() {
        return actualAnswer + "";
    }

    public void setActualAnswer(String actualAnswer) {
        this.actualAnswer = actualAnswer;
    }
    // toString

    @Override
    public String toString() {
        return question;
    }
}
