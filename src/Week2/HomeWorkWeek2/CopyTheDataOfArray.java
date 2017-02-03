package Week2.HomeWorkWeek2;

//Заданы два массива одинаковой длинны с любыми значениями,
  //      скопировать данные из первого массива во второй

/**
 * Created by User on 031 31.01.17.
 */
public class CopyTheDataOfArray {
    public static void main(String[] args) {
        int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destArr = new int[10];

        System.arraycopy(sourceArr, 5, destArr, 0, 5);
        for (int i=0; i < destArr.length; i++) {
            System.out.print(destArr[i] + " ");
        }
    }
}

