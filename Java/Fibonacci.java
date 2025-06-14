public class Fibonacci {

    public static int fibonacci(int x) {
        if (x <= 0) {
            if (x == -1) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

    public static void main(String[] args) {
        // テスト：-2 から 10 まで出力
        for (int i = -2; i <= 10; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}
