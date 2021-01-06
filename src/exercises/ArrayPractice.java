package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int numbers[]={1,1,2,3,5,8};
        String sentence="I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will " +
                "not eat them with a mouse";
        System.out.println("Odd numbers in array are : ");
        for(int i:numbers){
            if(!(i%2 == 0)) {
                System.out.println(i);
            }
        }
        String word[]=sentence.split("\\.");
//      String word[]=sentence.split(",");
//      String word[]=sentence.split(" ");
//      for(int i=0;i<word.length;i++){
//      System.out.println(word[i]);}
        System.out.println(Arrays.toString(word));

    }
}
