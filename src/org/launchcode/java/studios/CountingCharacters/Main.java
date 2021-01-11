package org.launchcode.java.studios.CountingCharacters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountingCharacters myCountingCharacters=new CountingCharacters();
        // String myUserInput = myCountingCharacters.getUserInput();
        String myUserInput = myCountingCharacters.getTextFromFile("src/org/launchcode/java/studios/CountingCharacters/test.txt");
        myCountingCharacters.characterCount(myUserInput);

    }
}
