package cf.roooster.beemovie;

import java.util.Random;

class Multiply {
    static String multiplySentences(int num, String[] array) {
        String str = "";
        int number = num;
        while (number > 0) {
            int random = new Random().nextInt(array.length);
            if (number == 1) {
                str = str + array[random] + ".";
            } else {
                str = str + array[random] + ". ";
            }
            number = number - 1;
        }
        return str;
    }
    static String multiplyWords(int num, String[] array) {
        String str = "";
        int number = num;
        while (number > 0) {
            int random = new Random().nextInt(array.length);
            if (number == 1) {
                str = str + array[random];
            } else {
                str = str + array[random] + " ";
            }
            number = number - 1;
        }
        return str;
    }
    static String multiplyParagraph(int num, String[] array) {
        String str = "";
        while (num > 0) {
            int[] number = {3, 4, 5};
            int randomNum = new Random().nextInt(number.length);
            int randomNumber = number[randomNum];
            while (randomNumber > 0) {
                str = str + multiplySentences(1, array) + " ";
                randomNumber = randomNumber - 1;
            }
            num = num - 1;
        }
        return str.trim();
    }
}
