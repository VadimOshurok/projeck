import java.util.Scanner;
import java.util.Arrays;

public class Exercise3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String text = (String) getText();
        int count = (int) howMany(text);
        System.out.println(count);
        String[] sorting =(String[]) sorting(text);
    }

    public static String getText(){
        System.out.println("Введите слова одной строкой через пробел");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        s = new String(chars);
        System.out.println(s);
        return s;
    }

    public static int howMany(String text){
        int count = 0;
        if(text.length() !=0){
            count++;
            for (int i=0;i<text.length();i++){
                if(text.charAt(i) == ' '){
                    count++;
                }
            }
        }
        return count;
    }

    public static String[] sorting(String text) {
        String[] words = text.split("\\s+");
        Arrays.sort(words);
        System.out.println("Сортировка: " + Arrays.toString(words));
        return words;
    }



}