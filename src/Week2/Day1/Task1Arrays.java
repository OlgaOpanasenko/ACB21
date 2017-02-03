package Week2.Day1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class Task1Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter value");
            myArray[i] = scanner.nextInt();
            if (myArray[i] % 2 == 0) {
                System.out.println("Couttable number");
            } else {
                System.out.println("Uncountable number");
            }
        }
    }
}
