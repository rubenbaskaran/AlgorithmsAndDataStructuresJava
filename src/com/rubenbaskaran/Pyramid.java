package com.rubenbaskaran;

class Pyramid
{
    static String Pyramid(int maxLevels)
    {
        int width = (maxLevels * 2 - 1);
        StringBuilder stringBuilder = new StringBuilder();

        for (int filling = 1; filling <= width; filling += 2)
        {
            StringBuilder sideSpaces = new StringBuilder();

            for (int space = 0; space < (width - filling) / 2; space++)
            {
                sideSpaces.append(" ");
            }

            stringBuilder.append("'" + sideSpaces);

            for (int hashtag = 1; hashtag <= filling; hashtag++)
            {
                stringBuilder.append("#");
            }

            stringBuilder.append(sideSpaces + "'" + "\n");
        }

        return stringBuilder.toString();
    }
}