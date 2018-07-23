package com.rubenbaskaran;

class Palindrome
{
    static Boolean Palindrome(String message)
    {
        String reversedMessage = "";
        for (int i = message.length() - 1; i >= 0; i--)
        {
            reversedMessage += message.split("")[i];
        }

        return reversedMessage.equals(message);
    }
}
