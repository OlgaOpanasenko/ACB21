package Week1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor speed");
        int oldSpeed = scanner.nextInt();

        System.out.println("Enter new speed");
        int newSpeed = scanner.nextInt();

        if (oldSpeed < 120 && newSpeed < 120) {
            System.out.println("Your speed is not high");
        } else {
            System.out.println("Sorry, speed is MAX");
        }
    }
}












