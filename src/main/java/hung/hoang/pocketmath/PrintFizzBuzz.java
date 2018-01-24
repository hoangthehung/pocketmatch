/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.hoang.pocketmath;

/**
 *
 * @author hoanghung
 */
public class PrintFizzBuzz {
    public String printNumber(int i){
        if (i % 15 == 0)
            return "FizzBuzz";
        if (i % 3 == 0)
            return "Fizz";
        if (i % 5 == 0)
            return "Buzz";
        return String.valueOf(i);
    }
    public void print1To100(){
        for (int i = 1; i <= 100; i++)
            System.out.println(printNumber(i));
    }
}
