package Week1.HomeWorkWeek1;

import java.util.Scanner;

/**
 * Created by User on 028 28.01.17.
 */
public class HomeWorkTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        int a = scanner.nextInt();

        System.out.print("Введите число 2: ");
        int b = scanner.nextInt();

        System.out.print("Введите число 3: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c){
            System.out.println (a + " is the biggest number");

        }else if (b >= a && b >= c){
            System.out.println (b + " is the biggest number");

        }else if(c >= a && c >= b){
            System.out.println (b + " is the biggest number");
        }
        if (a <= b && a <= c){
            System.out.println (a + " is the smallest number");

        }else if (b <= a && b <= c){
            System.out.println (b + " is the smsllest number");

        }else if (c <= b && c <= a){
            System.out.println (c + " is the smallest number");
        }
    }
}

