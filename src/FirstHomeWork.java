import java.util.Scanner;

/**
 * Created by Elin on 02.09.2017.
 */
public class FirstHomeWork {
    public static void main(String[] args) {
        colculate.calculate(int a, int b, int c, int d){
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
            int calculate;
            calculate = a * (b + (c / d));
            System.out.println(calculate);
        }




        }
    }
}

