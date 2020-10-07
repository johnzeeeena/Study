public class ThreeDigitNumbers2 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            String k = Integer.toString(i);
            int a = Integer.parseInt(String.valueOf(k.charAt(0)));
            int b = Integer.parseInt(String.valueOf(k.charAt(1)));
            int c = Integer.parseInt(String.valueOf(k.charAt(2)));
            if (a != b && b != c && c != a)
                System.out.println("" + a + b + c);
        }
    }
}
