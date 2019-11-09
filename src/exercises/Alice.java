
package exercises;
import java.util.Scanner;


public class Alice {
    public static void main(String[] args){
        String str= "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search");
        String word=input.nextLine();
        if(str.toLowerCase().contains("alice")){
            System.out.println("The search term "+word +" is found");
        }else {
            System.out.println("The search term "+word +" is not found");
        }
        System.out.println("The index of the "+word +" is "+ str.indexOf(word));
        System.out .println("The length of the string is "+ str.length());
    }
}
