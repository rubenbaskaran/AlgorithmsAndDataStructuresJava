package com.rubenbaskaran;

import java.util.HashMap;
import java.util.Map;

class Anagrams
{
    static Boolean Anagrams(String inputA, String inputB)
    {
        String inputAClean = inputA.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String inputBClean = inputB.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        HashMap<String, Integer> mapOfInputA = new HashMap<>();
        HashMap<String, Integer> mapOfInputB = new HashMap<>();

        for (String letter : inputAClean.split(""))
        {
            if (mapOfInputA.containsKey(letter))
            {
                mapOfInputA.replace(letter, mapOfInputA.get(letter) + 1);
            }
            else
            {
                mapOfInputA.put(letter, 1);
            }
        }

        for (String letter : inputBClean.split(""))
        {
            if (mapOfInputB.containsKey(letter))
            {
                mapOfInputB.replace(letter, mapOfInputB.get(letter) + 1);
            }
            else
            {
                mapOfInputB.put(letter, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapOfInputA.entrySet())
        {
            if (!mapOfInputB.containsKey(entry.getKey()) || !mapOfInputB.get(entry.getKey()).equals(entry.getValue()))
            {
                return false;
            }
        }

        return true;
    }
}
