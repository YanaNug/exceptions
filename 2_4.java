// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
import java.util.Scanner;

public class task2_4 {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            System.out.println("Вы ввели: " + userInput);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: Пустые строки вводить нельзя!");
        }
    }

    public static String getUserInput() throws EmptyInputException {
        // пользовательский класс исключения EmptyInputException, который наследуется от класса Exception
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        scanner.close();
        if (input.isEmpty()) {
            throw new EmptyInputException();
        }

        return input;
    }
}

class EmptyInputException extends Exception {
    public EmptyInputException() {
        super("Пустые строки вводить нельзя!");
    }
}