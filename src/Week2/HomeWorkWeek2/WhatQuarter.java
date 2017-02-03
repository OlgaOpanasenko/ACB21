package Week2.HomeWorkWeek2;

//В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число
//(в первую, вторую, третью или четвертую).

import java.util.Scanner;

/**
 * Created by User on 001 01.02.17.
 */
public class WhatQuarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int min = scanner.nextInt();

        if (min >= 0 && min <= 15) {
            System.out.println("That is the number of the 1-st quarter");
        } else if (min >= 16 && min <= 30) {
            System.out.println("That is the number of the 2-d quarter");
        } else if (min >= 31 && min <= 45) {
            System.out.println("That is the number of the 3-d quarter");
        } else if (min >= 46 && min <= 60) {
            System.out.println("That is the number of the 4-th quarter");
        }
    }
}
