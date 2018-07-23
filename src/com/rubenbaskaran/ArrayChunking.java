package com.rubenbaskaran;

class ArrayChunking
{
    static void ArrayChunking(String[] array, int chunkSize)
    {
        String concatenatedArray = "";

        for (String item : array)
        {
            concatenatedArray += item;
        }

        for (int startPosition = 0; startPosition <= concatenatedArray.length() - 1; startPosition += chunkSize)
        {
            int endPosition = (startPosition + chunkSize > concatenatedArray.length()) ? concatenatedArray.length() : startPosition + chunkSize;
            String temp = concatenatedArray.substring(startPosition, endPosition);
            System.out.println(temp);
        }
    }
}
