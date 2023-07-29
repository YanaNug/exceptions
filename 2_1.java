// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
//необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class task2_1 {
    public static float getUserInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Введите число: ");
                String input = scanner.nextLine();
                number = Float.parseFloat(input);
                validInput = true;
                scanner.close();
                System.out.format("Вы ввели число: %f", number);
            } catch (NumberFormatException e) {
                System.out.println("Увы, что-то пошло не так. Введите, пожалуйста, числовое значение.");
            }
        }

        return number;
        
    }
    public static void main(String[] args) {
        getUserInput();
    }
}