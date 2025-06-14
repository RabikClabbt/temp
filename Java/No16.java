public class No16 {
    public static void main(String[] args) {
        // 初期化
        int[] A = { 984, 369, 977, 598, 497, 638, 572, 421, 223, 107, 472, 137, 218, 825, 48, 827, 586, 688, 577, 446 };
        int N = A.length;
        int i = N - 2;

        while (i >= 0) {
            int j = N - 1;

            // A[i] <= A[j] かつ i < j の間 j を減らす
            while (A[i] <= A[j] && i < j) {
                j = j - 1;
            }

            if (A[i] > A[j]) {
                int w = A[i];
                int k = i;

                while (k < j) {
                    A[k] = A[k + 1];
                    k = k + 1;
                }

                A[j] = w;
            }

            i = i - 1;
        }

        // 表示処理
        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}
