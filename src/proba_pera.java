import java.util.Scanner;

/**
 * Created by Elin on 28.08.2017.
 */
public class proba_pera {
    public static void main(String[] args) {
        int first;
        int second;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое число");

            first = scanner.nextInt();
        System.out.println("Введите второе число для вычислений");
            second = scanner.nextInt();

//            chek(first, second);
            System.out.println(chek(first,second));
        }



    public static boolean chek (int a, int b) {
        int summ = a + b;
        boolean result = false;

        if (10 <= summ) {
            if (summ <= 20) {
                result = true;

            }
        } else {
            result = false;
        }



        return result;
    }
}
