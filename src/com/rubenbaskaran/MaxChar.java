package com.rubenbaskaran;

import java.util.*;

class MaxChar
{
    static List<String> MaxChar(String input)
    {
        HashMap<String, Integer> listOfLetters = new HashMap<>();

        for (String letter : input.split(""))
        {
            if (listOfLetters.containsKey(letter))
            {
                listOfLetters.replace(letter, listOfLetters.get(letter) + 1);
            }
            else
            {
                listOfLetters.put(letter, 1);
            }
        }

        int maxValue = Collections.max(listOfLetters.values());
        List<String> maxKeys = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : listOfLetters.entrySet())
        {
            if (entry.getValue().equals(maxValue))
            {
                maxKeys.add(entry.getKey() + " = " + entry.getValue());
            }
        }

        return maxKeys;
    }
}
