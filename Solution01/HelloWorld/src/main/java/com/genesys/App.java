package com.genesys;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length > 0 && !args[0].isEmpty())
            System.out.println(greetings(args[0]));
        else
            System.out.println( greetings() );
    }

    public static String greetings() {
        return greetings("world");
    }

    public static String greetings( String name ) {
        return "Hello, " + name + "!";
    }

    public static boolean fooBar() {
        return true;
    }

    public static boolean fooBar(boolean foo) {
        return false;
    }
}
