import java.util.Scanner;

/**
 * Created by Elin on 03.09.2017.
 */
public class HomeWork {
    public static void main(String[] args) {
        x();
        int result;
        result = a * (b + (c / d));
        System.out.println(result);
    }

    public static int x(int a, int b, int c, int d) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case '0':
                    a = scanner.nextInt();
                case '1':
                    b = scanner.nextInt();
                case '2':
                    c = scanner.nextInt();
                case '3':
                    d = scanner.nextInt();
            }
        }
    }
}
