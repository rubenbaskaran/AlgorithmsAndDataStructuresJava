package com.rubenbaskaran;

class ReverseString
{
    static String ReverseString(String message)
    {
        String reversedMessage = "";
        for (int i = message.length() - 1; i >= 0; i--)
        {
            reversedMessage += message.split("")[i];
        }

        return reversedMessage;
    }
}