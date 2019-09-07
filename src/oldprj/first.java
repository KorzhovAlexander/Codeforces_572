package oldprj;

import java.util.Scanner;

/**
 * Находит в строке лишние пробелы (2 и более, в начале, в конце) и убрать их
 * https://vk.com/topic-123851409_39456559
 */

public class first {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final String message=in.nextLine().replaceAll("^ | $| {2}","");
        System.out.println(message);
    }
}
