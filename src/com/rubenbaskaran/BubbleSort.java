package com.rubenbaskaran;

class BubbleSort
{
    static int[] numbers = {9, 7, 2, 4, 6, 1, 3, 8, 5};

    static void BubbleSort()
    {
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length - i - 1; j++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    int smallNumber = numbers[j + 1];
                    int bigNumber = numbers[j];

                    numbers[j] = smallNumber;
                    numbers[j + 1] = bigNumber;
                }
            }
        }
    }

    static void Print()
    {
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}