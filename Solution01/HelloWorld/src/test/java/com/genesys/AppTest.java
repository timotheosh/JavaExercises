package com.genesys;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGreetings() {
        assertTrue( App.greetings().equals("Hello, world!") );
    }

    @Test
    public void testGreetingsParam() {
        assertTrue( App.greetings("Sammy").equals("Hello, Sammy!") );
    }
}
