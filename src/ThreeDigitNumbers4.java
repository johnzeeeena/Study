public class ThreeDigitNumbers4 {
    public static void main(String[] args) {
        System.out.println("3х-значные числа, в десятичной записи которых нет одинаковых цифр: ");
        int a = 0, b = 0, c = 0;
        for (int j = 100; j < 1000; j++) {
            a = j / 10 / 10;
            b = j / 10 % 10;
            c = j % 100 % 10;
            if (a != b && a != c && b != c)
                System.out.println("" + j);
        }
    }
}

