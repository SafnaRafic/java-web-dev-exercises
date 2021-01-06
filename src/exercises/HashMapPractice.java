package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;
        int id;
        System.out.println("Enter Student Details");
        do {
            System.out.print("Student Name: ");
            name = input.nextLine();
            if (!name.equals("")){
                System.out.print("ID number: ");
                id = input.nextInt();
                students.put(name, id);
                input.nextLine();
            }
        }while(!name.equals(""));

        System.out.println("Class Roster");
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}

