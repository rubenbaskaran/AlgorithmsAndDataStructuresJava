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
//        FibonacciTest();
//        StackTest();
//        QueueTest();
//        BubbleSortTest();
//        SelectionSort();
//        QueueOfStacksTest();
//        RegularExpressions.RegularExpressions();
    }

    private static void QueueOfStacksTest()
    {
        QueueOfStacks queue = new QueueOfStacks();
        queue.Add(1);
        queue.Add(2);
        queue.Add(3);
        queue.Print();
        System.out.println("Next: " + queue.Peek());
        System.out.println("Removed: " + queue.Remove());
        System.out.println("Next: " + queue.Peek());
        System.out.println("Removed: " + queue.Remove());
        queue.Print();
    }

    private static void FibonacciTest()
    {
        Fibonacci.Fibonacci(10);
        System.out.println();
        System.out.println(Fibonacci.FibonacciRecursive(10));
    }

    static void QueueTest()
    {
        Queue queueOne = new Queue();
        Queue queueTwo = new Queue();
        Queue mergedQueue = new Queue();

        queueOne.Add(1);
        queueOne.Add(2);
        queueOne.Add(3);
        queueTwo.Add(9);
        queueTwo.Add(8);
        queueTwo.Add(7);
        queueOne.Print();
        queueTwo.Print();

        mergedQueue.Weave(queueOne, queueTwo);
        mergedQueue.Print();
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

    static void BubbleSortTest()
    {
        BubbleSort.Print();
        BubbleSort.BubbleSort();
        BubbleSort.Print();
    }

    static void SelectionSort()
    {
        SelectionSort.Print();
        SelectionSort.SelectionSort();
        SelectionSort.Print();
    }
}