import java.util.Scanner;

/**
 * Created by Elin on 08.09.2017.
 */
public class FiveHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите число для проверки");
        do {
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if ( check(a) == false) {
                    System.out.println("Ввведеное вами число было отрицательным");
                } else {
                    System.out.println("Введенное число было положительным");
                }
                System.out.println(check(a));

                break;
            } else {
                System.out.println("Нужно ввести менно число");
                scanner.nextLine();
            }
        } while (true);

    }

    public static boolean check (int number) {
        if (number < 0) {
            return false;
        } else {
            return true;
        }
    }
}
