package org.launchcode.java.studios.Inheritance;
import java.util.HashMap;

public class Quiz {

    private HashMap<Question, String> questionAnswerHashMap = new HashMap<>();

    public void addQuestionAndAnswer (Question question, String answer) {
        questionAnswerHashMap.put(question, answer);
    }

    public boolean isAnswerCorrect(Question question) {
        return (question.getActualAnswer()).equals(questionAnswerHashMap.get(question));
    }

    public char getGrade() {
        int total = questionAnswerHashMap.size();
        int score = 0;
        for (Question question : questionAnswerHashMap.keySet()) {
            if (isAnswerCorrect(question)) {
                score += 1;
            }
        }
        int grade = score/total * 100;
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}