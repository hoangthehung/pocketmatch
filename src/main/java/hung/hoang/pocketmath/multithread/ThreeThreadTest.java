/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.hoang.pocketmath.multithread;

/**
 *
 * @author hoanghung
 */
public class ThreeThreadTest {
    public void testParallel(){
        Foo foo = new Foo();
        ParallelTask task1 = new ParallelTask(foo, 1);
        ParallelTask task2 = new ParallelTask(foo, 2);
        ParallelTask task3 = new ParallelTask(foo, 3);
        Thread threadA = new Thread(task1, "1");
        Thread threadB = new Thread(task2, "2");
        Thread threadC = new Thread(task3, "3");
        threadA.start();
        try {
          threadA.join();
        } catch (InterruptedException ie) {
          ie.printStackTrace();
        }
        threadB.start();
        try {
          threadB.join();
        } catch (InterruptedException ie) {
          ie.printStackTrace();
        }
        threadC.start();
        try {
          threadC.join();
        } catch (InterruptedException ie) {
          ie.printStackTrace();
        }
    }
}
