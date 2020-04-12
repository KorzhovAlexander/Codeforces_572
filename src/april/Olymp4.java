package april;

/**
 * Офис, где на парт-тайм работает Митя, признали жизнеобеспечивающим и некоторые сотрудники приходят работать. Чтобы снизить вероятность распространения пандемии, каждое утро проводят дезинфекцию некоторых рабочих мест. Офис представляет из себя N кабинетов, доступ к которым проходит из общего коридора. Обрабатывают только те кабинеты, в которых вчера работали люди. Для дезинфекции вызывают несколько бригад. Каждая бригада может взять на себя только непрерывный ряд кабинетов длиной не больше чем XX (даже если этот промежуток включает кабинеты, которые не требуют обработки). Определите, какое минимальное количество бригад нужно вызвать этим утром.
 * <p>
 * Входные данные
 * Первая строка содержит целое число X<10^3– максимальное число подряд идущих кабинетов, которое можно дать одной бригаде.
 * Вторая строка содержит целое число N<10^3- количество кабинетов.
 * Следующие NN строк содержат числа 1 (кабинет требует дезинфекции) и 0 (кабинет не требует дезинфекции).
 * Результат работы
 * Выведите одно целое число – минимальное количество бригад, которые могут продезинфицировать офис.
 * <p>
 * Примеры
 * Входные данные
 * 6
 * 6
 * 1
 * 0
 * 1
 * 1
 * 0
 * 1
 * Результат работы
 * 1
 */

import java.io.*;
import java.util.StringTokenizer;

public class Olymp4 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        OlympTask solver = new OlympTask();

        short x = in.nextShort();
        int n = in.nextInt();

        solver.solve(x, n, in, out);

        out.close();
    }

    static class OlympTask {

        private short days;
        private boolean touched = false;

        public void solve(short x, int n, InputReader in, PrintWriter out) {

            if (x >= n) {
                for (short i = 0; i < n; i++) {
                    if (in.nextShort() == 1) {
                        out.print(1);
                        return;
                    }
                }
                out.print(0);
            } else {
                while (n > 0) {
                    if (x < n)
                        for (short i = 0; i < x; i++) {
                            if (in.nextShort() == 1 && !touched) {
                                days++;
                                touched = true;
                            }
                        }
                    else
                        for (short i = 0; i < n; i++) {
                            if (in.nextShort() == 1 && !touched) {
                                days++;
                                touched = true;
                            }
                        }
                    touched = false;
                    n = (n - x);
                }
                out.print(days);
            }
        }
    }

    static class InputReader {
        private final BufferedReader reader;
        private StringTokenizer stt;

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

        public String next() {
            while (stt == null || !stt.hasMoreTokens()) {
                stt = new StringTokenizer(nextLine());
            }
            return stt.nextToken();
        }

        public short nextShort() {
            return Short.parseShort(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
