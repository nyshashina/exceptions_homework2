package task1;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного
// числа (типа float), и возвращает введенное значение. Ввод текста вместо
// числа не должно приводить к падению приложения, вместо этого, необходимо
// повторно запросить у пользователя ввод данных.
public class Main {

    public static void main(String[] args) throws Exception {
        while (true){
            System.out.println("Введите число:");
            printFloat();
            }
    }
        public static void printFloat() throws Exception {
            Scanner scanner = new Scanner(System.in);
            try {
                float f = scanner.nextFloat();
                System.out.println(f);
            } catch (Exception e){
                System.out.println("Невозможно преобразовать в число.");
            }
        }
}
