import java.util.Scanner;

/**
 * Created by Elin on 13.09.2017.
 */
public class SixHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите Имя");
        String word = scanner.nextLine();
        printMyText(word);




    }

    public static void printMyText(String word) {
        System.out.println("Привет, " + word);

    }
}
