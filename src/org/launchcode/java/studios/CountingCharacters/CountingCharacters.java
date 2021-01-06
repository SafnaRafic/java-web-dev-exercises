package org.launchcode.java.studios.CountingCharacters;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> characterMap = new HashMap<>();
        File text = new File("C:\\Code\\LaunchCode\\java-practice\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\CountingCharacters\\test.txt");

//   HARD CODE
//        String str="If the product of two terms is zero then common sense says at " +
//                "least one of the two terms has to be zero to start with. So if you " +
//                "move all the terms over to one side, you can put the quadratics into a form" +
//                " that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";
//   INPUT FROM USER
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a string");
//        String str=input.nextLine();
        String hell = "Hello World";
        Path path = Paths.get(text.getPath());
        int ln = 72;
        List<String> insertLine = Files.readAllLines(path, StandardCharsets.UTF_8);
        insertLine.add(ln, "\t\tinsertLine.add(72,\"\t\tSystem.out.println(hell);\");");
        Files.write(path, insertLine, StandardCharsets.UTF_8);

//to append to the end of a file.
        OutputStream oos = null;
        try {
            oos = new FileOutputStream(text, true);
            oos.write("// Hello ".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Scanner scnr = new Scanner(text);
        int lineNumber = 1;

        while (scnr.hasNextLine()) {
            String str = scnr.nextLine();
            lineNumber++;
            str = str.toLowerCase();
            str = str.toLowerCase();
            str = str.replaceAll("[^a-z ]", "");
            char[] charactersInString = str.toCharArray();
            for (char c : charactersInString) {
                if (characterMap.containsKey(c)) {
//               System.out.println("If block - value of "+c+ " before is " +characterMap.get(c) +" now adding 1");
                    characterMap.put(c, characterMap.get(c) + 1);
                } else {

//               If char is not present in characterMap, initializing the char with 1  as value
                    characterMap.put(c, 1);
//               System.out.println("Else block - value of "+c+ " is 1" );

                }
            }
            for (Map.Entry<Character, Integer> character : characterMap.entrySet()) {
                System.out.println(character.getKey() + " : " + character.getValue());
            }

         //
        }
    }
}

