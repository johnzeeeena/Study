public class ThreeDigitNumbers4 {
    public static void main(String[] args) {
        System.out.println("3х-значные числа, в десятичной записи которых нет одинаковых цифр: ");
        for (int j = 100; j < 1000; j++) {
           int a = j / 10 / 10;
           int b = j / 10 % 10;
           int c = j % 100 % 10;
            if (a != b && a != c && b != c)
                System.out.println("" + j);
        }
    }
}

