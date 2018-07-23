package com.rubenbaskaran;

class ReverseInteger
{
    static int ReverseInteger(int number)
    {
        String reversedNumber = "";
        int sign = Integer.signum(number);

        // If integer is signed then exclude the sign in the reversal
        int minimumBound = sign == -1 ? 1 : 0;

        for (int i = String.valueOf(number).length() - 1; i >= minimumBound; i--)
        {
            reversedNumber += String.valueOf(number).split("")[i];
        }

        return Integer.parseInt(reversedNumber) * sign;
    }
}