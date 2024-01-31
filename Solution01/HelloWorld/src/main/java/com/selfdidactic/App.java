package com.selfdidactic;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        if (name.isEmpty())
            name = "World";
        System.out.println( "Hello " + name + "!" );
    }
}
