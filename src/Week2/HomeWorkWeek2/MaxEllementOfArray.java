package Week2.HomeWorkWeek2;

//Найдите наибольший элемент массива

/**
 * Created by User on 030 30.01.17.
 */
public class MaxEllementOfArray {
    public static void main(String[] args) {
        int[] array = {25, 76, 56};

        int maxIndex = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                maxIndex = array[i];

                System.out.println(maxIndex);

            }
        }


    }
}
