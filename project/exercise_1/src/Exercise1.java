import java.util.Scanner;
public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] newNum) {
        int num = (int) getInt();
        parity(num);
        checkIsItANaturalNumber(num);
    }

    public static double getInt() {
        System.out.println("Введите целое число: ");
        int num = 0;
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else{
            throw new NumberFormatException("число введено не верно");
        }
    }

    public static void parity(int num) {
        if (num % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Не чётное");
        }
    }

    private static void checkIsItANaturalNumber(int num) {
        boolean log = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                log = true;
            }
        }
        if (log) {
            System.out.println("составное");
        }else {
            System.out.println("простое");
        }
    }
}