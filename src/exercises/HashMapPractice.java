package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student Id and names
        do {
            System.out.print("Student ID : ");
            newStudentId = input.nextInt();

            // Read in the newline before looping back
            input.nextLine();

            if (!newStudentId.equals(-1)) {
                System.out.print("Student Name : ");
                String newStudentName = input.nextLine();
                students.put(newStudentId, newStudentName);
            }

        } while(!newStudentId.equals(-1));

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());

        }
    }
}



//        Old program
//        HashMap<String, Integer> students = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        String name;
//        int id;
//        System.out.println("Enter Student Details");
//        do {
//            System.out.print("Student Name: ");
//            name = input.nextLine();
//            if (!name.equals("")){
//                System.out.print("ID number: ");
//                id = input.nextInt();
//                students.put(name, id);
//                input.nextLine();
//            }
//        }while(!name.equals(""));
//
//        System.out.println("Class Roster");
//        for (Map.Entry<String, Integer> student : students.entrySet()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//
//        }
//    }
//}

