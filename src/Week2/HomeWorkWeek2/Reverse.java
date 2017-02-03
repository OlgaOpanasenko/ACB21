package Week2.HomeWorkWeek2;

//Реализовать метод, который делает реверс строки

/**
 * Created by User on 031 31.01.17.
 */
public class Reverse {
    public static void main(String[] args) {
        String[] a = {"trea", "5764", "9*5=5+76"};
        System.out.println(reverseAndConcaternate(a));
    }

    static String reverseAndConcaternate(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();

}
}
