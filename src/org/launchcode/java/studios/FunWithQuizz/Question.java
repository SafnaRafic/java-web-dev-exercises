package org.launchcode.java.studios.FunWithQuizz;

import java.util.Objects;

public abstract class Question {
    //fields
    public String question;
    //abstract method
    public abstract String getActualAnswer();

    //constructor
    public Question(String question) {
        this.question = question;
    }
    //getter and setter

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question1 = (Question) o;
        return question.equals(question1.question);
    }

    //hashcode
    @Override
    public int hashCode() {
        return Objects.hash(question);
    }
}
