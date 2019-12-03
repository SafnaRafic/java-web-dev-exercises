package org.launchcode.java.studios.FunWithQuizzes;

import java.util.Scanner;

public class MultipleChoice extends Question {
    public String answer;
    public MultipleChoice(String prompt,String answer) {
        super(prompt,answer);
    }

    @Override
    public String toString() {
        return "MultipleChoice{" +
                "answer='" + answer + '\'' +
                ", prompt='" + prompt + '\'' +
                '}';
    }
}
