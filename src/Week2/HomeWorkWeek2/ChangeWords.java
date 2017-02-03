package Week2.HomeWorkWeek2;

//Реализовать метод, который меняет местами слова в строке, состоящей из двух слов

/**
 * Created by User on 003 03.02.17.
 */
public class ChangeWords {
        public static void main(String[] args) {
            String twoWords = "hello world";
            String twoWordsReversed = reverseTwoWords(twoWords);
            System.out.println(twoWordsReversed);
        }


        public static String reverseTwoWords(String text){
            String[] arrStr = text.split(" ");
            String wordOne = arrStr[0].toString();
            String wordTwo = arrStr[1].toString();
            String newStr = String.valueOf(wordTwo) + " " + String.valueOf(wordOne);
            return newStr;
        }
    }


