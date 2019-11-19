package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    Teacher(String firstName,String lastName,String subject,int yearsTeaching){
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject=subject;
        this.yearsTeaching=yearsTeaching;
    }
    public String getFirstName(){
        return firstName;
    }
    private void setFirstName(String aFirstName){
        this.firstName=aFirstName;
    }
    public String getLastName(){
        return lastName;
    }
    private void setLastName(String aLastName){
        this.lastName=aLastName;
    }
    public String getSubject(){
        return subject;
    }
    private void setSubject(String aSubject){
        this.subject=aSubject;
    }
    public int getYearsTeaching(){
        return yearsTeaching;
    }
    private void setYearsTeaching(int aYearsTeaching){
        this.yearsTeaching=aYearsTeaching;
        System.out.println("Years of Teaching "+yearsTeaching);
    }
}
