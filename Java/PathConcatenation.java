import java.util.regex.Pattern;
import java.util.regex.Matcher;
import static java.lang.System.out;

public class PathConcatenation {
    // 正規表現パターン
    private static final String FOLDER_PATH_PATTERN = "^[a-zA-Z]:\\\\(?:[^\\/:*?\"<>|\r\n]+\\\\?)*$";
    private static final String FILE_NAME_PATTERN = "^[^\\/:*?\"<>|\r\n]+\\.[a-zA-Z0-9]+$";

    public static void main(String[] args) {
        // テストデータ
        String folder = "C:\\Users\\Rabik\\Documents\\test";
        String file = "example.txt";

        out.println("フォルダパス: " + folder);
        out.println("ファイル名: " + file);

        // IF文で検証
        if (isValidFolderPath(folder) && isValidFileName(file)) {
            if (!folder.endsWith("\\")) {
                folder += "\\";
            }
            String fullPath = folder + file;
            out.println("結合されたパス: " + fullPath);
        } else {
            out.println("パス形式が不正です");
        }
    }

    // フォルダパスの検証
    private static boolean isValidFolderPath(String folderPath) {
        Pattern pattern = Pattern.compile(FOLDER_PATH_PATTERN);
        Matcher matcher = pattern.matcher(folderPath);
        return matcher.matches();
    }

    // ファイル名の検証
    private static boolean isValidFileName(String fileName) {
        Pattern pattern = Pattern.compile(FILE_NAME_PATTERN);
        Matcher matcher = pattern.matcher(fileName);
        return matcher.matches();
    }
}