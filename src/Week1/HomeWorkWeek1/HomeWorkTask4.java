package Week1.HomeWorkWeek1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class HomeWorkTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число c плавающей точкой");
        double a = scanner.nextDouble();
        if (a >= 0 && a <= 1) {
            System.out.println("The number is within 0 & 1");
        } else {
            System.out.println(" Error");
        }
    }
}

