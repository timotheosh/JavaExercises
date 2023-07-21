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
    public void caluclateFoobar() {
        assertTrue( App.count("foobar") == 6 );
    }

    @Test
    public void calculateHamburger() {
        assertTrue( App.count("hamburger") == 9 );
    }
}
