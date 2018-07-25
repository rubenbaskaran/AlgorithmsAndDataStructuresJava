package com.rubenbaskaran;

class RegularExpressions
{
    static void RegularExpressions()
    {
        String message = "||hello_ world123!? :-)||";
        System.out.println(message.replaceAll("[^a-zA-Z0-9]", "")); // OUTPUT: helloworld123
        System.out.println(message.replaceAll("[^a-zA-Z]", "")); // OUTPUT: helloworld
        System.out.println(message.replaceAll("[^0-9]", "")); // OUTPUT: 123
    }
}
