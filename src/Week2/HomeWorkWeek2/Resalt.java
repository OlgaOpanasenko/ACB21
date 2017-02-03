package Week2.HomeWorkWeek2;

//Создайте переменные a и b. Просуммируйте их, а результат запишите в переменную result.
//Если result больше 5, то присвойте переменной result значение 5.
//Если же она меньше 5-ти - то умножьте ее на 10. Выведите на экран значение переменной result.

import java.util.Scanner;

/**
 * Created by User on 031 31.01.17.
 */
public class Resalt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a ");
        int a = scanner.nextInt();

        System.out.println("Введите число b ");
        int b = scanner.nextInt();

        int resalt = a + b;

        if (resalt > 5) {
            System.out.println(resalt = 5);

        }else if (resalt < 5){
            System.out.println (resalt*10);
        }


    }
}