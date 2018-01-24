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
public class ParallelTask implements Runnable {

    private Thread predecessor;
    Foo foo;
    int type;
    public ParallelTask(Foo foo, int type) {
        this.foo = foo;
        this.type = type;
    }
    
    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
                callMethod();
        System.out.println(Thread.currentThread().getName() + " Finished");

    }
    private void callMethod() {
        switch (type){
            case 1: foo.first();break;
            case 2: foo.second();break;
            case 3: foo.third();break;
        }
    }
    
}
