package org.launchcode.java.studios.FunWithQuizz;

import java.util.HashMap;

public class Quiz {
    public HashMap<Question, String> QuestionAnswer = new HashMap<>();

    //Method to add Question and answer
    public void addQuestionAnswer(Question question, String answer) {
        QuestionAnswer.put(question, answer);
    }

    //Method to check answer is correct
    public boolean isAnswerCorrect(Question questions) {
        return (questions.getActualAnswer()).equals(QuestionAnswer.get(questions));
    }

    //method to grade
    public int getScore() {

        int total = QuestionAnswer.size();
        int score = 0;
        for (Question question : QuestionAnswer.keySet()) {
            if (isAnswerCorrect(question)) {
                score += 1;
            }
        }
        return score;
    }
}


//        System.out.println("Total: "+total);
//        int grades = (score/total) * 100;
//        System.out.println("Grade Percentage: "+grades);
//        if (grades >= 90) {
//            return 'A';
//        } else if (grades >= 80) {
//            return 'B';
//        } else if (grades >= 70) {
//            return 'C';
//        } else if (grades >= 60) {
//            return 'D';
//        } else {
//            return 'F';
//        }
//    }
//}
