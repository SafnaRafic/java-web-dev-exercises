package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student=new Student("safna",34,1,4.0);
        System.out.println("Student GPA : "+student.getGPA());
        Teacher teacher=new Teacher("Blake","Rafic","Java",4);
        System.out.println("Teacher's FirstName: "+teacher.getFirstName());
        System.out.println("Teachers's Year of Experience: "+teacher.getYearsTeaching());
    }
}


