package senla.mikhalchenko.task1;
/*Напишите программу, которая возвращает количество "троек" в заданной строке.
Тройка - это символ, появляющийся три раза подряд в строке.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
  
    public static void main(String[] args) {
        System.out.println("Input string");
        Task1 task1 = new Task1();

        Scanner input = new Scanner(System.in);
        String str = input.next();
        Code code = new Code();
        System.out.println("You input string is: " + str);
        code.getRepeatedCharactersInARowXTimes(str, 3);
    }
}
