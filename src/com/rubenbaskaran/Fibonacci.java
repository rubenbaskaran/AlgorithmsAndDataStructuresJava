package com.rubenbaskaran;

class Fibonacci
{
    static void Fibonacci(int length)
    {
        int numberOne = 0;
        int numberTwo = 1;

        for(int i = 0; i < length; i++)
        {
            int newNumber = numberOne + numberTwo;

            System.out.print(newNumber + " ");

            numberOne = numberTwo;
            numberTwo = newNumber;
        }
    }

    static int FibonacciRecursive(int length)
    {
        if (length < 2)
        {
            return length;
        }

        return FibonacciRecursive(length - 1) + FibonacciRecursive(length - 2);
    }
}