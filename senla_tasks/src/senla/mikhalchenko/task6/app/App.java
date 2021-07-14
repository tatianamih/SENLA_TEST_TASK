package senla.mikhalchenko.task6.app;


/*Создайте программу, которая будет получать число и печатать его в следующем формате (формы цифр можно
придумать свою, главное чтобы она читалась на экране.(*) Дополнительно: сделайте так, чтобы «большая цифра» состояла
 не из ‘*’, а из соответствующих маленьких(обычных) цифр.
 */

import senla.mikhalchenko.task6.console.Menu;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
    }
}