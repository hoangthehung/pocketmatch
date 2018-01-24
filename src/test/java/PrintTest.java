/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hung.hoang.pocketmath.PrintFizzBuzz;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoanghung
 */
public class PrintTest {
    
    public PrintTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void fizzBuzzTest(){
        PrintFizzBuzz print = new PrintFizzBuzz();
        assertEquals("FizzBuzz", print.printNumber(30));
    }
    @Test
    public void fizzTest(){
        PrintFizzBuzz print = new PrintFizzBuzz();
        assertEquals("Fizz", print.printNumber(9));
    }
    @Test
    public void buzzTest(){
        PrintFizzBuzz print = new PrintFizzBuzz();
        assertEquals("Buzz", print.printNumber(10));
    }
    @Test
    public void numberTest(){
        PrintFizzBuzz print = new PrintFizzBuzz();
        assertEquals("4", print.printNumber(4));
    }
}
