package Week2.HomeWorkWeek2;

import java.util.Arrays;

//Найдите минимальный по модулю элемент массива


/**
 * Created by User on 001 01.02.17.
 */
public class MinAbs {
    public static void main(String[] args) {

        int[] mas = {0, 1, 2, 3, 4, -5, 6, 7, -8, 9};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                int temp = mas[i];
                temp = Math.abs(temp);
                mas[i] = temp;

                //System.out.println(Arrays.toString(mas));
              //  System.out.println(Arrays.stream(mas).sorted().findFirst().getAsInt());

                if (mas.length > 0) {
                    int min = mas[0];
                    for (int el = 0; el < mas.length - 1; el++) {
                        if (el < min) min = el;
                    }
                    System.out.println(min + " ");
                }


            }
        }
    }
}


