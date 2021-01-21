package exercises.ch4classes.school;

public class Student {
    public static void main(String[] args){

        Student myself = new Student("Safna", 1,30,4.0);
        Student twin = new Student("Safna",2,20,2.0);
        Teacher teacher = new Teacher();
//        String myGradeLevel = myself.getGradeLevel();
//        System.out.println(myGradeLevel);

//        myself.addGrade(3,3.0);
//        System.out.println(myself.gpa);
//        myself.addGrade(3,3.0);
//        System.out.println(myself.gpa);
//
//        System.out.println(myself.toString());
//        System.out.println(myself.equals(twin));

        Course myFirstCourse = new Course(" My First Course ",2);
        Course mySecondCourse = new Course(" My Second Course ",3);
        Course myThirdCourse = new Course(" My First Course ",1);
//        System.out.println(myFirstCourse.equals(mySecondCourse));
//        System.out.println(myFirstCourse.equals(myThirdCourse));

        System.out.println(myFirstCourse.toString());
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {

        return (this.name + " has a GPA of: " + this.gpa);
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        if(myStudentObj.name.equals(this.name)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return this.name +" : "+ this.gpa;
    }

    /* getters and setters omitted */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

//    Instance method

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        // total quality score = gpa * number of credits
        double currentTotalQualityScore = this.gpa *numberOfCredits;

        // quality score = letter grade(0.0 - 4.0) * number of credits
        double newQualitySCore =  grade * courseCredits;

        //update current quality score with the new quality score we just calculated
        double newTotalQualityScore =  currentTotalQualityScore + newQualitySCore;

        // update students total number of credits
        int newTotalNUmberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNUmberOfCredits;

        //gpa = (total quality score) / (total number of credits)
        double newGpa = newTotalQualityScore / newTotalNUmberOfCredits;
        this.gpa = newGpa;

        // The quality score for a class is found by multiplying the letter grade score (0.0-4.0) by the number of credits.


        //Use the new course grade and course credits to update their total quality score
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        // Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)
        if(this.numberOfCredits >=0 && this.numberOfCredits <= 29){
            return "Freshman";
        }
        else if(this.numberOfCredits >=30 && this.numberOfCredits <= 50){
            return "Sophomore";
        }
        else if(this.numberOfCredits >=60 && this.numberOfCredits <= 89){
            return "Junior";
        } else if(this.numberOfCredits >= 90){
            return "Senior";
        }else{
            return null;
        }
    }
}
