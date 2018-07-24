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

            System.out.println(newNumber);

            numberOne = numberTwo;
            numberTwo = newNumber;
        }
    }
}