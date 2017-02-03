package Week1.HomeWorkWeek1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class HomeWorkTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        int a = scanner.nextInt();

        System.out.println("Введите число b");
        int b = scanner.nextInt();

        if (a >= 11 && a <= 19 && b >= 11 && b <= 19) {
            System.out.println(a + b);
        } else {
            System.out.println("The number is not within 11 & 19");
        }

    }
}



