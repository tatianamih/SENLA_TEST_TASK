package senla.mikhalchenko.task1.view;

import senla.mikhalchenko.task1.service.Service;

import java.util.Scanner;

public class ConsoleUI {
    public void consoleInput() {
        System.out.println("Input string");
        Service service = new Service();

        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println("You input string is " + "'" + str + "'");
        service.getRepeatedCharactersInARowXTimes(str, 3);
    }
}
