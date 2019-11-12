package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        HashMap<Character,Integer> characterMap=new HashMap<>();

//        INPUT FROM USER
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=input.nextLine();

//        HARD CODE
//        String str="If the product of two terms is zero then common sense says at " +
//                "least one of the two terms has to be zero to start with. So if you " +
//                "move all the terms over to one side, you can put the quadratics into a form" +
//                " that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";


        str = str.toLowerCase();
        str=str.toLowerCase();
        str= str.replaceAll("[^a-z ]", "");
        char[] charactersInString =str.toCharArray();
        for(char c:charactersInString){
           if(characterMap.containsKey(c)){
//               System.out.println("If block - value of "+c+ " before is " +characterMap.get(c) +" now adding 1");
               characterMap.put(c, characterMap.get(c) + 1);
           }
           else {

//               If char is not present in characterMap, initializing the char with 1  as value
               characterMap.put(c, 1);
//               System.out.println("Else block - value of "+c+ " is 1" );

           }
        }
        for (Map.Entry<Character, Integer> character : characterMap.entrySet()) {
            System.out.println(character.getKey() + " : " + character.getValue());
        }
    }
}
