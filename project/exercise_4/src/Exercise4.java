import java.util.Scanner;

public class Exercise4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        System.out.println("Введите текст");
        String text = (String) getText();
        System.out.println("Введите слово которое нужно найти");
        String word = (String) getText();
        System.out.println(count(text, word));
    }

    public static int count(String text, String word) {
        String where = text.toLowerCase();
        String what = word.toLowerCase();

        int result = 0;
        int index = 0;
        String substring = where;
        while (index < substring.length() && substring.indexOf(what) != -1) {
            result++;
            index += substring.indexOf(what) + what.length();
            substring = where.substring(index);
        }
        return result;
    }

    public static String getText(){
        scanner.hasNextLine();
        return scanner.nextLine();
    }

}
