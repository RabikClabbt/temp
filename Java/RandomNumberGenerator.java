import java.util.*;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("最大値：");
        int maxValue = sc.nextInt(); // 指定された最大値
        System.out.print("生成数：");
        int numberOfValues = sc.nextInt(); // 指定された生成数

        Random rand = new Random();
        Set<Integer> generatedValues = new HashSet<>(); // 生成された値を格納するSet

        while (generatedValues.size() < numberOfValues) {
            int randomNumber = rand.nextInt(maxValue) + 1; // 1からmaxValueまでの乱数を生成
            if (!generatedValues.contains(randomNumber)) { // 生成された値がSetに含まれていない場合
                generatedValues.add(randomNumber); // Setに値を追加
                System.out.print(randomNumber + ", ");
            }
        }

        sc.close();
    }
}