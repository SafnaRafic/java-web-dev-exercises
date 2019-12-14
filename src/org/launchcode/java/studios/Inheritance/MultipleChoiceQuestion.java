package org.launchcode.java.studios.Inheritance;

import java.util.HashMap;

public class MultipleChoiceQuestion extends Question {
    private String actualAnswer;

    private HashMap<String, String> multipleChoices = new HashMap();

    public String getActualAnswer() {
        return actualAnswer;
    }

    public void setActualAnswer(String actualAnswer) {
        this.actualAnswer = actualAnswer;
    }

    public MultipleChoiceQuestion(String questionString) {
        super(questionString);
    }

    public HashMap<String, String> getMultipleChoices() {
        return multipleChoices;
    }

    public void setMultipleChoices(HashMap<String, String> multipleChoices) {
        this.multipleChoices = multipleChoices;
    }

    public void addMultipleChoice (String String, String choice) {
        this.multipleChoices.put(String, choice);
    }
}

