package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getCredits(){
        return numberOfCredits;
    }
    public double getGPA(){
        return gpa;
    }
    private void setStudent(String aName,int aStudentId,int aNumberOfCredits,double aGpa) {
        name = aName;
        studentId = aStudentId;
        numberOfCredits= aNumberOfCredits;
        gpa=aGpa;
    }
    public Student(String name,int studentId,int numberOfCredits,double gpa){
        this.name=name;
        this.studentId=studentId;
        this.numberOfCredits=numberOfCredits;
        this.gpa=gpa;
    }

}