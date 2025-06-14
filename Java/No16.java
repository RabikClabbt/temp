public class No16 {
    public static void main(String[] args) {
        // 初期化
        int[] numbers = {
                984, 369, 977, 598, 497, 638, 572, 421, 223, 107,
                472, 137, 218, 825, 48, 827, 586, 688, 577, 446 };
        int length = numbers.length;
        int i = length - 2;

        while (i >= 0) {
            int j = length - 1;

            // numbers[i] <= numbers[j] かつ i < j の間 j を減らす
            while (numbers[i] <= numbers[j] && i < j) {
                j = j - 1;
            }

            if (numbers[i] > numbers[j]) {
                int temp = numbers[i];
                int k = i;

                while (k < j) {
                    numbers[k] = numbers[k + 1];
                    k = k + 1;
                }

                numbers[j] = temp;
            }

            i = i - 1;
        }

        // 表示処理
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}
