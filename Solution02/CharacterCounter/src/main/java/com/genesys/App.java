package com.genesys;

import java.util.Scanner;

/**
 * Character Counting
 *
 */
public class App
{
    public static void main( String[] args ) {
        String input = promptUntilInput();
        System.out.println(input + " has " + count(input) + " characters.");
    }

    public static String promptUntilInput() {
        String input = "";
        while (input.isEmpty()) {
            input = promptInput();
        }
        return input;
    }

    public static String promptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the input string? ");
        return sc.nextLine();
    }

    /*
     * This exists just for the sake of creating a unit test.
    */
    public static Integer count(String data) {
        return data.length();
    }
}
