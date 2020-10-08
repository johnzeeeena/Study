import java.util.Scanner;

public class Rord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность цыфр: ");
        long value = scanner.nextInt();
        while (value != 0) {
            long mirror = value % 10;
            value = value / 10;
            System.out.print("" + mirror);
        }
    }
}
