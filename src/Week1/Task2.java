package Week1;

import java.util.Scanner;
/**
 * Created by User on 028 28.01.17.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Shop");
        String shop = scanner.nextLine();

        System.out.println("2.Fresh");
        boolean fresh = scanner.nextBoolean();

        System.out.println("3.Bottle");
        boolean bottle = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("4.Country");
        String country = scanner.nextLine();



        if ((shop.equals("Eco") || shop.equals("Silpo")) && (fresh == true) && (bottle == true) &&
                country.equals("UA") || (!country.equals("RUS")||
                country.equals("USA"))) {
            System.out.println("OK");


        } else {
            System.out.println("Not ok");
        }
    }

}
