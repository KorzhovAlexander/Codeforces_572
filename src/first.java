import java.util.Scanner;

/**
 * Находит в строке лишние пробелы (2 и более, в начале, в конце) и убрать их
 * https://vk.com/topic-123851409_39456559
 */

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message=in.nextLine().replaceAll("^ | $| {2}","");
        System.out.println(message);
    }
}
