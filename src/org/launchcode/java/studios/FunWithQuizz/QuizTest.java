package org.launchcode.java.studios.FunWithQuizz;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuizTest {
    ArrayList<MultipleChoice> multipleChoices = new ArrayList<>();
    ArrayList<Checkbox> checkboxes = new ArrayList<>();
    ArrayList<TrueOrFalse> trueOrFalse = new ArrayList<>();
    Quiz quiz=new Quiz();
    @Before
    public void setup() {

        MultipleChoice question1 = new MultipleChoice("What type of Inheritance does Java have?");
        question1.addMultipleChoice("a", "Single Inheritance");
        question1.addMultipleChoice("b", "Double Inheritance");
        question1.addMultipleChoice("c", "Multiple Inheritance");
        question1.addMultipleChoice("d", "Class Inheritance");

        question1.setActualAnswer("a");
        multipleChoices.add(question1);

        MultipleChoice question2 = new MultipleChoice("What restriction is there on using the super reference in a constructor?");
        question2.addMultipleChoice("a", "It can only be used in the parent's constructor.");
        question2.addMultipleChoice("b", "Only one child class can use it.");
        question2.addMultipleChoice("c", "It must be used in the last statement of the constructor.");
        question2.addMultipleChoice("d", "It must be used in the first statement of the constructor.");

        question2.setActualAnswer("d");
        multipleChoices.add(question2);

        TrueOrFalse trueOrFalse1 = new TrueOrFalse("Subclass inherit both member variables and methods?");
        trueOrFalse1.setActualAnswer("False");
        trueOrFalse.add(trueOrFalse1);

        Checkbox checkbox1 = new Checkbox("Why use Inheritance in java?");
        checkbox1.check("Code ReUsability");
        checkbox1.uncheck("Only one child can use it");
        checkbox1.check("For Method overriding");
        checkbox1.uncheck("It can inherit multiple classes");

        checkboxes.add(checkbox1);
    }
    @Test
    public void testMultipleChoices(){
        quiz.addQuestionAnswer(multipleChoices.get(0),"a");
        assertTrue(quiz.isAnswerCorrect(multipleChoices.get(0)));
    }
    @Test
    public void testTrueOrFalse(){
        quiz.addQuestionAnswer(trueOrFalse.get(0),"False");
        assertTrue(quiz.isAnswerCorrect(trueOrFalse.get(0)));
    }
    @Test
    public void testCheckbox(){
        String[] selections={"Code ReUsability","For Method Overriding"};
        quiz.addQuestionAnswer(checkboxes.get(0),checkboxes.get(0).hashcode(selections));
    }
    @Test
    public void testScore(){
        quiz.addQuestionAnswer(multipleChoices.get(0),"a");
        quiz.addQuestionAnswer(multipleChoices.get(1),"d");
        quiz.addQuestionAnswer(trueOrFalse.get(0),"True");
        String[] selections={"Code ReuUsability"};
        quiz.addQuestionAnswer(checkboxes.get(0),checkboxes.get(0).hashcode(selections));
        assertEquals(2,quiz.getScore());
    }

}
