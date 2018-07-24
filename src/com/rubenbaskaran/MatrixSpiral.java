package com.rubenbaskaran;

class MatrixSpiral
{
    static void MatrixSpiral(int size)
    {
        int maxCounter = size * size;
        int currentCounter = 1;
        int columnStart = 0;
        int columnEnd = size - 1;
        int rowStart = 0;
        int rowEnd = size - 1;

        int[][] arrayOfArrays = new int[size][size];

        do
        {
            for (int columnPosition = columnStart; columnPosition <= columnEnd; columnPosition++)
            {
                arrayOfArrays[rowStart][columnPosition] = currentCounter;
                currentCounter++;
            }
            rowStart++;

            for (int rowPosition = rowStart; rowPosition <= rowEnd; rowPosition++)
            {
                arrayOfArrays[rowPosition][columnEnd] = currentCounter;
                currentCounter++;
            }
            columnEnd--;

            for (int columnPosition = columnEnd; columnPosition >= columnStart; columnPosition--)
            {
                arrayOfArrays[rowEnd][columnPosition] = currentCounter;
                currentCounter++;
            }
            rowEnd--;

            for (int rowPosition = rowEnd; rowPosition >= rowStart; rowPosition--)
            {
                arrayOfArrays[rowPosition][columnStart] = currentCounter;
                currentCounter++;
            }
            columnStart++;
        }
        while (currentCounter <= maxCounter);

        for (int[] row : arrayOfArrays)
        {
            for (int column : row)
            {
                System.out.print(column + " ");
            }
            System.out.println("");
        }


        // TODO: For-loop - At columnEnd - rowStart to rowEnd = increment columnEnd
        // TODO: For-loop - At rowEnd - columnEnd to columnStart = increment rowEnd
        // TODO: For-loop - At columnStart - rowEnd to rowStart = increment columnStart
    }
}