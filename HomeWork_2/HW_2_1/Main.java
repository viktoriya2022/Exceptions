/*
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float)
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого
необходимо повторно запросить у пользователя ввод данных.
*/

package HomeWork_2.HW_2_1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Введите дробное число (разделитель - точка): ");
                String input = scanner.nextLine();
                System.out.println("Вы ввели число: "+ Float.parseFloat(input));
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Можно ввести только число. Попробуйте ещё раз: ");
            }
        }
    }
}
