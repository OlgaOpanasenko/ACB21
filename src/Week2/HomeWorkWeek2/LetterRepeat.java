package Week2.HomeWorkWeek2;

//Посчитать колличество букв 'a' в строке (искомый символ может быть разным)

/**
 * Created by User on 001 01.02.17.
 */
public class LetterRepeat {

    public static void main(String[] args) {
        String s = "a";
        int[] arr = new int[98];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        for (int i = 97; i < 98; i++) {
            System.out.println((char) i + " встречается " + arr[i] + " раз");
        }
    }
}