package senla.mikhalchenko.task1.service;
/*Напишите программу, которая возвращает количество "троек" в заданной строке.
Тройка - это символ, появляющийся три раза подряд в строке.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public void getRepeatedCharactersInARowXTimes(String text, int numberOfDuplicateElements) {
        int count = 0;
        Matcher matcher = Pattern.compile("(.)\\1+").matcher(text);
        while (matcher.find()) {
            String subString = matcher.group();
            if (subString.length() == numberOfDuplicateElements) {
                count++;
            } else {
                count += 0;
            }
        }
        System.out.println("\n" + "The number of consecutive repeating " + numberOfDuplicateElements +
                " identical elements in the string is equal to " + count);
    }
}

