package com.rubenbaskaran;

class Capitalize
{
    static String Capitalize(String input)
    {
        String[] words = input.split(" ");
        String output = "";

        for (String word : words)
        {
            String[] lettersInWord = word.split("");
            lettersInWord[0] = lettersInWord[0].toUpperCase();

            StringBuilder stringBuilder = new StringBuilder();

            for (String letter : lettersInWord)
            {
                stringBuilder.append(letter);
            }

            output += stringBuilder.toString() + " ";
        }

        return output;
    }
}
