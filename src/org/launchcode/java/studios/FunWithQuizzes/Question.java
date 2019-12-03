package org.launchcode.java.studios.FunWithQuizzes;

import java.util.Objects;
import java.util.Scanner;

public class Question {
    protected String prompt;
    private String answers;
    Scanner input=new Scanner(System.in);
    public Question(){

    }
    public Question(String prompt, String answers) {
        this.prompt = prompt;
        this.answers = answers;
    }

    public String getPrompt() {
        return prompt;
    }

    public String getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "prompt='" + prompt + '\'' +
                ", answers='" + answers + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return Objects.equals(getPrompt(), question.getPrompt()) &&
                Objects.equals(getAnswers(), question.getAnswers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrompt(), getAnswers());
    }
    public int takeTest(Question[] question){
        int score=0;
        for(int i=0;i<question.length;i++){
            System.out.println(question[i].prompt);
            String ans=input.nextLine().toLowerCase();
            if(ans.equals(question[i].answers)){
                score++;
            }
        }
        return score;

    }
}
