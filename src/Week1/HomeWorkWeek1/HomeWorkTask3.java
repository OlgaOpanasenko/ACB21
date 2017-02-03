package Week1.HomeWorkWeek1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class HomeWorkTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число делимое на 7");
        int a = scanner.nextInt();

        if (a % 7 == 0) {
            System.out.println("Удвоенное значение " + a * 2);
        } else {
            System.out.println("Это число не делится на 7 нацело");
        }
    }
}
