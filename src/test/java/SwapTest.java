/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hung.hoang.pocketmath.SwapEvenOddArray;
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
public class SwapTest {
    
    public SwapTest() {
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
    // @Test
    // public void hello() {}
    @Test
    public void commonTest(){
        SwapEvenOddArray swapper = new SwapEvenOddArray();
        int[] expected = new int[]{2,4,24,6,4,8,1,3,5,9,11,7};
        int[] actual = swapper.swapArray(new int[]{2,4,7,6,9,8,1,3,5,4,11,24});
        assertArrayEquals(expected, actual);
    }
    @Test
    public void allEvenTest(){
        SwapEvenOddArray swapper = new SwapEvenOddArray();
        int[] expected = new int[]{2,4,4,6,8,10,18,28};
        int[] actual = swapper.swapArray(new int[]{2,4,4,6,8,10,18,28});
        assertArrayEquals(expected, actual);
    }
    @Test
    public void allOddTest(){
        SwapEvenOddArray swapper = new SwapEvenOddArray();
        int[] expected = new int[]{1,3,5,7};
        int[] actual = swapper.swapArray(new int[]{1,3,5,7});
        assertArrayEquals(expected, actual);
    }
     @Test
    public void emptyTest(){
        SwapEvenOddArray swapper = new SwapEvenOddArray();
        int[] expected = new int[]{};
        int[] actual = swapper.swapArray(new int[]{});
        assertArrayEquals(expected, actual);
    }
}
