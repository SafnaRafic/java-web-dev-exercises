package exercises;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        StringSearch alice = new StringSearch();
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        String quoteLowerCase = quote.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search: ");
        String searchTerm = input.next().toLowerCase();

        boolean result= alice.searchQuote(quoteLowerCase,searchTerm);
        System.out.println(result);
        if(result) {
            alice.searchTermIndex(quoteLowerCase, searchTerm);
            alice.removeSearchTerm(quote,searchTerm);
        }

    }
    // Searching the word from string
    public boolean searchQuote(String quote, String searchTerm ) {
         return quote.contains(searchTerm);
    }

    // Getting index and length
    public void searchTermIndex(String quote, String searchTerm){
        int index = quote.indexOf(searchTerm);
        System.out.println("The index is "+index);
        System.out.println("The length is "+ searchTerm.length());
    }

    // Remove the word from the quote
    public void removeSearchTerm(String quote, String searchTerm){
        int endPoint1 = quote.indexOf(searchTerm);
        int startingPoint2 = quote.indexOf(searchTerm)+searchTerm.length();

        String newQuote = quote.substring(0,endPoint1)+quote.substring(startingPoint2);
        System.out.println(newQuote);
    }
}
