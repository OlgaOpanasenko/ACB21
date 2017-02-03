package Week2.Day2;

import java.util.Scanner;

/**
 * Created by User on 029 29.01.17.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = scanner.nextInt();

        int a = 35;
        int b = 87;
        if (a % 7 == 1 || a % 7 == 2 || a % 7 == 5 || b % 7 == 1 || b % 7 == 2 || b % 7 == 5) {
            System.out.println(value);
        } else
            System.out.println("Error");

    }
}




