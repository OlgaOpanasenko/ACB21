package Week2.HomeWorkWeek2;

//Вводится строка слов. Вывести слова в обратном порядке

/**
 * Created by User on 001 01.02.17.
 */
public class ReverseTask {
    public static void main(String[] args) {

        String names = "Hello World";
        String  reverse = new StringBuilder(names).reverse().toString();
             System.out.print(reverse);
        }
    }
