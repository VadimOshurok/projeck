import java.util.Scanner;

public class Exercise5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n;
        n= (int) getInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = i;

        }
        for (int i = 0; i < n; i++)
        {
            if (arr[i] % 10 == (arr[i] - (arr[i] % 10)) / 10)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static int getInt() {
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else{
            throw new NumberFormatException("число введено не верно");
        }
    }

}
