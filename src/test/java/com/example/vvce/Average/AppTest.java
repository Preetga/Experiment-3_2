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
        assertEquals(1,app.avgoftwo(1,2));
    }
    
    public void AverageofThreeNumber() {
    	assertEquals(2,app.avgofthree(1, 2, 3));
    	}
}
