package task4;
// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Введите строку: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            try {
                validateInput(s);
            } catch (EmptyStringException e) {
                throw new EmptyStringException("Пустые строки вводить нельзя!");
            }
        }
    }
    public static void validateInput(String input) throws EmptyStringException {
        if (input == null || input.isEmpty()) {
            throw new EmptyStringException("Input cannot be null or empty");
        }
    }
}