package april;

/**
 * Митя выиграл право первым выбрать комнату в общежитии, чтобы пережить пандемию в самоизоляции. Первый вариант "M" размером aa на bb метров, второй вариант "P" cc на dd метров. Митя хочет выбрать комнату с большей площадью. Определите, на чем он в итоге остановится?
 *
 * Входные данные
 * Первая и единственная строка содержит 4 различных числа, разделенных пробелами: a, b, c, da,b,c,d, такие, что (1 \le a, b, c, d \le 1000)(1≤a,b,c,d≤1000)
 * Результат работы
 * Выведите единственную латинскую букву: "M" если Митя выберет 1 комнату, "P" если Митя выберет 2 комнату и "E" если комнаты равны.
 *
 * Входные данные
 * 3 6 6 10
 * Результат работы
 * P
 */

import java.io.*;
import java.util.StringTokenizer;

public class Olymp1 {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        OlympTask solver = new OlympTask();

        solver.solve(in,out);

        out.close();
    }

    static class OlympTask {
        public void solve(InputReader in, PrintWriter out) {
            short a = in.nextShort();
            short b = in.nextShort();
            short c = in.nextShort();
            short d = in.nextShort();

            if (a*b==c*d) {
                out.print("E");
                return;
            }

            if (a*b>c*d)
                out.print("M");
            else
                out.print("P");
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

    }

}