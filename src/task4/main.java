package task4;
// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите строку: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            try {
                validateInput(s);
            } catch (EmptyStringException e) {
                System.out.println("Пустые строки вводить нельзя!");
            }
        }
    }
    public static void validateInput(String input) throws EmptyStringException {
        if (input.isEmpty()) {
            throw new EmptyStringException("Пустые строки вводить нельзя!");
        }
    }
}