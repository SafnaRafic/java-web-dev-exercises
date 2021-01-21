package exercises.ch4classes.school;

import org.launchcode.java.studios.CountingCharacters.CountingCharacters;

import java.util.ArrayList;

public class Course {
    // At least 3 properties
    // Name
    private String name;
    // List of Students
    private ArrayList<Student> students;
    // worth number of credits
    private int worthNumberOfCredits;

    //Contructors
    public Course(String name, int worthNumberOfCredits){
        this.name = name;
        this.worthNumberOfCredits=worthNumberOfCredits;
    }

    @Override
    public String toString() {
        return this.name +" is worth "+this.worthNumberOfCredits + " number of credits.";
    }
    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;
        if(myCourseObj.name.equals(this.name)) return true;
        else return false;
    }
}
