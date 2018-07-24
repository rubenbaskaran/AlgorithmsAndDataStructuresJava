package com.rubenbaskaran;

class Steps
{
    static void Steps(int maxSteps)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (int step = 1; step <= maxSteps; step++)
        {
            stringBuilder.append("'");

            for (int position = 1; position <= step; position++)
            {
                stringBuilder.append("#");
            }

            stringBuilder.append("'");
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder.toString());
    }
}