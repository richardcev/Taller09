/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class MovieRentalTest {
    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    public MovieRentalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    
     @Test
    public void testGetTitle() {
        assertEquals("The Man Who Knew Too Much", theManWhoKnewTooMuch._title);
    }

    @Test
    public void testSetPriceCode() {
        theManWhoKnewTooMuch.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(Movie.NEW_RELEASE, theManWhoKnewTooMuch.getPriceCode());
        theManWhoKnewTooMuch.setPriceCode(Movie.REGULAR);
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }

    @Test
    public void testGetDaysRented() {
        assertEquals(2, new MovieRental(theManWhoKnewTooMuch, 2).getDaysRented());
    }


    
}
