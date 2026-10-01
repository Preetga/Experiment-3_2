package com.example.vvce.Average;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
App app=new App();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void AverageofTwoNumber() {
        assertEquals(2,app.avgoftwo(2,3));
    }
    @Test
    public void AverageofThreeNumber() {
    	assertEquals(3,app.avgofthree(2, 3, 4));
    	}
}
