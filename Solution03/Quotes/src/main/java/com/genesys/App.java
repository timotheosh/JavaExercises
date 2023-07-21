package com.genesys;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String addQuote = "y";
        while(!addQuote.equals("n")) {
            addQuote();
            addQuote = prompt("Do you wish to add a quote? (press 'n' to stop) ");
        }
        Connect.getQuotes();
    }

    public static String promptUntilInput(String question) {
        String input = "";
        while(input.isEmpty()) {
            input = prompt(question);
        }
        return input;
    }

    public static String prompt(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.print(question + " ");
        return sc.nextLine();
    }

    public static void addQuote() {
        Connect.createNewTable();
        String quote = promptUntilInput("What is the quote?");
        String author = promptUntilInput("Who said it?");
        System.out.println(author + " says " + "\"" +  quote + "\"");
        Connect.addQuote(quote, author);
    }
}
