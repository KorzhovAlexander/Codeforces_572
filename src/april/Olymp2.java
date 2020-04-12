package april;

/**
 * Митя разбирает документы на компьютере. В частности, он наводит порядок в своих электронных конспектах и хочет упорядочить их по количеству слов. Конспект состоит из прописных и строчных латинских букв, пробелов, точек, запятых, восклицательных и вопросительных знаков, двоеточий, точек с запятой и символа "-" (в качестве дефиса или тире: дефис слева и справа ограничен латинскими буквами, в остальных случаях символ "-" считается тире). Слово – это последовательность подряд идущих букв и дефисов. Для заданного текста Митя хочет написать программу, которая скажет ему количество слов.
 *
 * Входные данные
 * Первая и единственная строка содержит до 1000 символов
 * Результат работы
 * Выведите количество слов в данной строке.
 *
 * Примеры
 * Входные данные
 * ho-ho-ho my merry - merry
 * Результат работы
 * 4
 */

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Olymp2 {

    private static final String PATTERN = "(\\b[\\S]+\\b[\\s]*)";

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        String word = in.nextLine();

        final Pattern pattern = Pattern.compile(PATTERN);
        final Matcher matcher = pattern.matcher(word);
        int count = 0;
        while (matcher.find())
            count++;
        out.println(count);

        out.close();
    }

    static class InputReader {
        private final BufferedReader reader;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }
    }

}

