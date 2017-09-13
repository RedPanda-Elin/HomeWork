import java.util.Scanner;

/**
 * Created by Elin on 13.09.2017.
 */
public class EightHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год для проверки на високосность");
        int year = scanner.nextInt();
//        boolean result = visocos(year);
        if (visocos(year) == false) {
            System.out.println("Год " + year + " не високосный!");
        } else {
            System.out.println("Год " + year + " високосный");
        }

    }
    public static boolean visocos(int chek) {
        float j = chek % 4;
        if (j == 0) {
            if (chek % 100 == 0 || chek % 400 != 0) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }

    }


}
