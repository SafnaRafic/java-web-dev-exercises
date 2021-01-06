package org.launchcode.java.studios.FunWithQuizz;

import java.util.HashMap;
import java.util.Objects;

public class Checkbox extends Question  {

    private HashMap<String,Boolean> checkbox=new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Checkbox)) return false;
        if (!super.equals(o)) return false;
        Checkbox checkbox1 = (Checkbox) o;
        return Objects.equals(getCheckbox(), checkbox1.getCheckbox());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCheckbox());
    }

    //constructor to call super class
    public Checkbox(String question) {
        super(question);
    }
    //getter
    public HashMap<String, Boolean> getCheckbox() {
        return checkbox;
    }
    //setter
    public void setCheckbox(HashMap<String, Boolean> checkbox) {
        this.checkbox = checkbox;
    }

    //Methods
    public void check(String ans){
        checkbox.put(ans,true);
    }
    public void uncheck(String ans){
        checkbox.put(ans,false);
    }
    @Override
    public String getActualAnswer() {
        int actualAnswer = 0;
        for (String key : checkbox.keySet()) {
            if (checkbox.get(key)) {
                actualAnswer += key.hashCode();
            }
        }
        return String.valueOf(actualAnswer);
    }

    public String hashcode(String[] keys) {
        int selected = 0;
        for (String key : keys) {
            selected += key.hashCode();
        }
        return String.valueOf(selected);
    }
    //toString

    @Override
    public String toString() {
        return question;
    }
}
