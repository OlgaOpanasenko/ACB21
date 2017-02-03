package Week2.HomeWorkWeek2;

//Найдите среднее арифметическое массива из 10 элементов типа double.

/**
 * Created by User on 031 31.01.17.
 */
public class TheAverege {
    public static void main(String[] args) {
        int[] numbers = {53, 56, 12, -8, -54, 6, -76, 17, 31};

        double average = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            average = sum / numbers.length;
            System.out.println(average);
        }


    }
}
