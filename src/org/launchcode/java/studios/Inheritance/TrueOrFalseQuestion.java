package org.launchcode.java.studios.Inheritance;
public class TrueOrFalseQuestion extends Question {

    private char actualAnswer;

    public String getActualAnswer() {
        return actualAnswer + "";
    }

    public void setActualAnswer(char actualAnswer) {
        this.actualAnswer = actualAnswer;
    }

    public TrueOrFalseQuestion(String questionString) {
        super(questionString);
    }
}
