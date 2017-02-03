package Week2.HomeWorkWeek2;

//Найти слово, стоящее в тексте под номером 3 и вывести его первую букву

import java.util.Scanner;

/**
 * Created by User on 002 02.02.17.
 */
public class FindTheWordAndReplace {
    public static void main(String[] args) {
        String input = "If a declarator in a field declaration has a variable "
                + "initializer, then the declarator has the semantics of an "
                + "assignment (§15.26) to the declared variable.\n"
                + "If the declarator is for a class variable (that is, a static "
                + "field), then the following rules apply to its initializer";

        input = input.replaceAll("\\W", " ").       // заменить на пробел любой символ, кроме буквенного или цифрового символа или знака подчёркивания
                replaceAll("\\d", "").              // удалить все цифровые символы
                replaceAll(" +", " ");              // оставить между словами только 1 пробел
        String arr[] = input.split(" ");

        System.out.println("Input word number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > arr.length || num < 1) {
            System.out.println("Incorrect number. Word not found");
        } else {
            System.out.println("Word number " + num + " = " + arr[num - 1] + "; first letter = " + arr[num - 1].charAt(0));
        }
    }
}