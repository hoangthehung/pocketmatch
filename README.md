# Testing on pocket math

Here is a set of questions that we would like to have you complete, there are
a total of 5 questions. We are looking for simplicity of the solution, time-
space complexity, code style, functional correctness. Adding tests is a plus.
Please be sure to explain the time-space complexity for the questions where
appropriate. You can leave comments, we will read them! We expect you to use
Java programming language while working on these tasks.
   1. Take an array of integers and partition it so that all the even
      integers in the array precede all the odd integers in the array.
      (bonus: Your solution must take linear time in the size of the array
      and operate in-place with only a constant amount of extra space.)
      sample input:  2,4,7,6,1,3,5,4
      sample output: 2,4,6,4,7,1,3,5
   2. Write a program that prints the numbers from 1 to 100. But for
      multiples of three print "Fizz" instead of the number and for the
      multiples of five print "Buzz". For numbers which are multiples of both
      three and five print "FizzBuzz".
   3. Given an array of words, find the frequencies of the words, then print
      in descending order based on the frequency
         a. AA CC BB BB CC CC
            CC 3
BB 2 AA 1
   4. Implement a LinkedList, add(), get(), remove(), insert() (bonus: with
      generics).
5. Suppose we have the following code: class Foo {
Foo() {...}
void first() {...} void second() {...} void third() {...}
}
The same instance of Foo will be passed to three different threads. Thread A will call first(), Thread B will call second(), and Thread C will call
third(). Design a mechanism to ensure that first() is called before second() and second() is called before third().
