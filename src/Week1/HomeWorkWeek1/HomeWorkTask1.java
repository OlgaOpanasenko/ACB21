package Week1.HomeWorkWeek1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class HomeWorkTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущее время: ");
        int inRecentTime = scanner.nextInt();

        if (inRecentTime < 0 && inRecentTime > 24)
            System.out.println("В сутках такого времени нет");

        else if (inRecentTime >= 9 && inRecentTime <= 18)
            System.out.println("Я на работе");
        else
            System.out.println("Я отдыхаю");
    }
}
