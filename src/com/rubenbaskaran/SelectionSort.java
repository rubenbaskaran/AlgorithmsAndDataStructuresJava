package com.rubenbaskaran;

class SelectionSort
{
    static int[] numbers = {5, 2, 3, 8, 4, 9, 7, 1, 6, 0, 15, 14, 13, 11, 12, 10};

    static void SelectionSort()
    {
        for (int i = 0; i < numbers.length; i++)
        {
            int indexOfMin = i;

            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[indexOfMin] > numbers[j])
                {
                    indexOfMin = j;
                }
            }

            if (i != indexOfMin)
            {
                int temp = numbers[i];
                numbers[i] = numbers[indexOfMin];
                numbers[indexOfMin] = temp;
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
