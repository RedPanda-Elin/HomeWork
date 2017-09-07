import java.util.Scanner;

/**
 * Created by Elin on 03.09.2017.
 */
public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите подряд 4 числа");

        do {

            if (scanner.hasNextInt()) {
                int one = scanner.nextInt();
                int two = scanner.nextInt();// багает если начать писать цифры, а продолжить буквами (
                int three = scanner.nextInt();
                int four = scanner.nextInt();
                System.out.println(x(one, two,three,four));
                break;
            } else {
                System.out.println("Нужно ввести менно число");
                scanner.nextLine();
            }
        } while (true);

    }

    public static int x (int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;

            }
        }






