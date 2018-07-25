package com.rubenbaskaran;

public class Main
{
    public static void main(String[] args)
    {
//        System.out.println(ReverseString.ReverseString("hello!!"));
//        System.out.println(Palindrome.Palindrome("helleh"));
//        System.out.println(String.valueOf(ReverseInteger.ReverseInteger(-357000)));
//        System.out.println(String.valueOf(MaxChar.MaxChar("abbcccddddeeeeefgghhiiijjjjkkkkkooooo")));
//        FizzBuzz.FizzBuzz(30);
//        String[] array = {"1","2","3","4","5","6","7","8","9","1","2","3"};
//        ArrayChunking.ArrayChunking(array, 6);
//        System.out.println(Anagrams.Anagrams("abbccc", "c!AB!!c!b!c"));
//        System.out.println(Capitalize.Capitalize("this is a test from admin !!!"));
//        Steps.Steps(20);
//        System.out.println(Pyramid.Pyramid(5));
//        System.out.println(Vowels.Vowels("this is a test message with vowels"));
//        MatrixSpiral.MatrixSpiral(5);
//        Fibonacci.Fibonacci(5);
        StackTest();

        // TODO: Queue, BubbleSort, SelectionSort
    }

    static void StackTest()
    {
        Stack stack = new Stack();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Print();
        System.out.println("Peek: " + stack.Peek());
        System.out.println("Pop: " + stack.Pop());
        System.out.println("Peek: " + stack.Peek());
        System.out.println("Pop: " + stack.Pop());
        System.out.println("Peek: " + stack.Peek());
        System.out.println("Pop: " + stack.Pop());
        System.out.println("Peek: " + stack.Peek());
        System.out.println("Pop: " + stack.Pop());
        System.out.println("Peek: " + stack.Peek());
    }
}