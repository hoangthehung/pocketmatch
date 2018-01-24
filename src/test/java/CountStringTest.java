/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hung.hoang.pocketmath.CountString;
import java.util.HashMap;
import java.util.Map;
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
public class CountStringTest {
    
    public CountStringTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void normalTest() {
         CountString ct = new CountString();
         Map<String, Integer> expecteds = new HashMap<String, Integer>();
         expecteds.put("CC", 3);
         expecteds.put("BB", 2);
         expecteds.put("AA", 1);
         assertEquals(expecteds, ct.printOrderString(new String[]{"AA", "CC", "BB", "CC", "BB", "CC"}));
     }
     @Test
     public void equalTest() {
         CountString ct = new CountString();
         Map<String, Integer> expecteds = new HashMap<String, Integer>();
         expecteds.put("CC", 4);
         expecteds.put("BB", 3);
         expecteds.put("AA", 2);
         assertEquals(expecteds, ct.printOrderString(new String[]{"AA", "CC", "BB", "AA", "CC", "BB", "CC", "BB", "CC"}));
     }
}
