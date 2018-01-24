/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.hoang.pocketmath;

import hung.hoang.pocketmath.multithread.Foo;
import hung.hoang.pocketmath.multithread.ParallelTask;
import hung.hoang.pocketmath.multithread.ThreeThreadTest;

/**
 *
 * @author hoanghung
 */
public class PocketMathTestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreeThreadTest test = new ThreeThreadTest();
        test.testParallel();
    }

}
