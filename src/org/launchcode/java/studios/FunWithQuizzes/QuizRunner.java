package org.launchcode.java.studios.FunWithQuizzes;

public class QuizRunner {
    public static void main(String[] args) {

        String q1 = "How do we call base constructor from derived class?\n" +
                "(a)super \n(b)base\n(c) callBase\n";
        String q2 = "Which access modifier of a base class are available to its derived classes?\n" +
                "(a)private\n(b)both public and protected\n(c)protected \n(d)public\n";
        String q3 = "A class derived from an abstract class must implement all of the abstract methods it inherits." +
                "\nTrue\nFalse\n";
        String q4="We cannot override private methods." +
                "\nTrue\nFalse\n";
        MultipleChoice[] choices = {new MultipleChoice(q1, "super"),
                new MultipleChoice(q2, "both public and protected")
        };
        TrueFalse[] trueFalse = {new TrueFalse(q3, "false"),
                new TrueFalse(q4,"true")};
        Question question=new Question();

        int score=question.takeTest(choices);
        score+=question.takeTest(trueFalse);
        System.out.println("Your score is "+score);

    }
}

