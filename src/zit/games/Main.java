package zit.games;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Консольный калькулятор v0.1");
        Scanner scanner = new Scanner(System.in);
        int a, b, operation, result;
        System.out.println("Введите число А:");
        a = scanner.nextInt();
        System.out.println("Введите число B:");
        b = scanner.nextInt();
        System.out.println("Выберете операцию: \n 1 - Сложение; \n 2 - Вычитание; \n 3 - Умножение; \n 4 - Деление; \n 5 - Остаток;");
        operation = scanner.nextInt();
        result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b == 0) {
                    System.out.println("BUG");
                    return;
                }
                result = a / b;
                break;
            case 5:
                if (b == 0) {
                    System.out.println("BUG");
                    return;
                }
                result = a % b;
                break;
            default:
                System.out.println("Допущена ошибка в выборе действия. Действие № " + operation + " Не найдено");
                break;
        }
        JOptionPane.showMessageDialog(null, "Результат = " + result + JOptionPane.INFORMATION_MESSAGE);
    }
}