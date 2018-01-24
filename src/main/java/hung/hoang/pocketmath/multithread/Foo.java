/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.hoang.pocketmath.multithread;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author hoanghung
 */
public class Foo {

    String value = "";

   

    public Foo() {
        value = "";
    }

    public void first() {
        try {
            Thread.sleep(6000l);
        } catch (Exception ex){}
        value += "first ";
        System.out.println(value);
    }

    public void second() {
        try {
            Thread.sleep(3000l);
        } catch (Exception ex){}
        value += "second ";
        System.out.println(value);
    }

    public void third() {
        try {
            Thread.sleep(10);
        } catch (Exception ex){}
        value += "third ";
        System.out.println(value);
    }
}
