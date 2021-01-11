package org.launchcode.java.studios.CountingCharacters;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class CountingCharacters {
    //class variables

    // constructors
    public CountingCharacters() {
    }

    //methods
    public void characterCount(String wordToCount) {
        //make case insensitive

        wordToCount = wordToCount.toLowerCase();

        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<Character, Integer>();

        //for (char c : strArray) {
        for (int i = 0; i < arrayOfChars.length; i++) {
            //Add or update the count of each character into the hash map

            char theCharacter = arrayOfChars[i];

            //Exclude non -alphabetic character
            if (Character.isLetter(arrayOfChars[i]) == false) {
                //Exclude it!
                continue; // continue says - stop what you are doing and continues to the top(for loop)
            }
            if (myCharacterCount.containsKey(theCharacter) == false) {

                // Does not contain the key
                myCharacterCount.put(theCharacter, 1);
            } else {
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }
//            System.out.println(myCharacterCount);

        }
        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for (int i = 0; i < myCharacterKeys.size(); i++) {
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + " : " + theValue);
        }
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    public String getTextFromFile(String pathToFile) {
        String content = " ";
        try {
            content = new String(Files.readAllBytes(Paths.get(pathToFile)));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return content;
    }
}

//    public static void main(String[] args) throws IOException {
//
//        HashMap<Character, Integer> characterCounts = new HashMap<>();
////        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String testString = input.nextLine();
//        char[] charactersInString = testString.toLowerCase().toCharArray();
//
//        for (char character : charactersInString) {
//            if(Character.isLetter(character)) {
//                if (characterCounts.containsKey(character)) {
//                    characterCounts.put(character, characterCounts.get(character) + 1);
//                } else {
//                    characterCounts.put(character, 1);
//                }
//            }
//        }
////        System.out.println(testString +"\n "+characterCounts);
//        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
//            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
//        }
//
//    }
//}


