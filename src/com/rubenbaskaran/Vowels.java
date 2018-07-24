package com.rubenbaskaran;

class Vowels
{
    static int Vowels(String input)
    {
        String[] vowels = {"a", "e", "i", "o", "u"};
        int numberOfVowels = 0;

        for (String vowel : vowels)
        {
            for (String letter : input.toLowerCase().split(("")))
            {
                numberOfVowels = letter.equals(vowel) ? ++numberOfVowels : numberOfVowels;
            }
        }

        return numberOfVowels;
    }
}