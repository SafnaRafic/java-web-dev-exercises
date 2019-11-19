package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Course {

        private String courseId;
        private String course;
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();

        public String getCourseId()
        {
                return courseId;
        }
        private void setCourseId(String aCourseId)
        {
                this.courseId=aCourseId;
        }
        public String getCourse(){

                return course;
        }
        private void setCourse(String aCourse){

                this.course=aCourse;
        }
        private static HashMap<Integer, Student> init() {
                Student s1 = new Student("Reena", 12, 2, 3.5);
                Student s2 = new Student("Nehan", 11, 1, 4.0);
                Student s3 = new Student("Nashat", 13, 1, 3.8);
                HashMap<Integer, Student> map = new HashMap<Integer, Student>();
                map.put(s1.getStudentId(), s1);
                map.put(s2.getStudentId(), s2);
                map.put(s3.getStudentId(), s3);
                return map;
        }
        public static void main(String[] args) {
                Course course=new Course();
                course.setCourseId("J12765");
                course.setCourse("Java");

                System.out.println("\nCourse Details \nCourse ID: "+course.getCourseId());
                System.out.println("Course : "+course.getCourse());
                System.out.println("\nStudent Details from Student Class");
                HashMap<Integer, Student> map = new HashMap<Integer, Student>();
                map=init();
                for (Integer s : map.keySet()) {
                        System.out.println("**************");
                        System.out.println("Name : "+map.get(s).getName());
                        System.out.println("Student Id: " + s);
                        System.out.println("Number of credits : " + map.get(s).getCredits());
                        System.out.println("GPA : " + map.get(s).getGPA());
                        System.out.println("**************\n");
                }

        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Course course1 = (Course) o;
                return Objects.equals(courseId, course1.courseId) &&
                        Objects.equals(course, course1.course) &&
                        Objects.equals(map, course1.map);
        }

        @Override
        public int hashCode() {
                return Objects.hash(courseId, course, map);
        }
}
//        public static void main(String[] args) {
//
//                HashMap<Integer, Student> map = new HashMap<Integer, Student>();
//                Student s1 = new Student(
//                        "Reena", 12, 2, 3.5);
//                Student s2 = new Student(
//                        "Nehan", 11, 1, 4.0);
//                Student s3 = new Student(
//                        "Nashat", 13, 1, 3.8);
//
//                map.put(s1.getStudentId(), s1);
//                map.put(s2.getStudentId(), s2);
//                map.put(s3.getStudentId(), s3);
//
//                for (Integer s : map.keySet()) {
//                        System.out.println("**************");
//                        System.out.println("Name : "+map.get(s).getName());
//                        System.out.println("Student Id: " + s);
//                        System.out.println("Number of credits : " + map.get(s).getCredits());
//                        System.out.println("GPA : " + map.get(s).getGPA());
//                        System.out.println("**************\n");
//                }
//        }
//}

