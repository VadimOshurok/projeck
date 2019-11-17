import java.util.Scanner;

public class Exercise2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int num1 = (int) getInt();
        int num2 = (int) getInt();
        int nok = (int) nok(num1, num2);
        int nod = (int) nod(num1, num2);
    }

    public static int getInt() {
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else{
            throw new NumberFormatException("число введено не верно");
        }
    }

    static int nok(int num1, int num2) {
        if (num1 < num2) {
            for (int i = 2; i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println("Нок: " + i);
                    break;
                }
            }
        } else {
            for (int i = 2; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println("Нок: " + i);
                    break;
                }
            }
        }
        return 0;
    }
    static int nod(int num1, int num2) {
        if (num1<num2){
            for (int i = num1; i >= 2; i--)
            {
                if (num1 % i == 0 && num2 % i == 0)
                {
                    System.out.println("Нод: " + i);
                    break;
                }
            }
        }else {
            for (int i = num2; i >= 2; i--)
            {
                if (num1 % i == 0 && num2 % i == 0)
                {
                    System.out.println("Нод: " + i);
                    break;
                }
            }
        }
        return 0;
    }
}
