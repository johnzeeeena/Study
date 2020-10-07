public class ThreeDigitNumbers1 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            String k = String.valueOf(i);
            char[] s = k.toCharArray();
            if (s[0] != s[1] && s[1] != s[2] && s[2] != s[0])
                System.out.println("" + s[0] + s[1] + s[2]);

        }
    }
}
