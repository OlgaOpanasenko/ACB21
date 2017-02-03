package Week1.HomeWorkWeek1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class HomeWorkTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        double a = scanner.nextDouble();

        System.out.println("Введите число b");
        double b = scanner.nextDouble();

        if (a % b == 0 && a % b != 1) {
            System.out.println("True " + (a / b));
        } else
            System.out.println("False " + (a / b));

        if (b % a == 0 && b % a != 1) {
            System.out.println("True " + (b / a));
        } else
            System.out.println("False " + (b / a));
    }
}

