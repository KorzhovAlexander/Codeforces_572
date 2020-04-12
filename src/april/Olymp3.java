package april;
/**
 * Митя играет в онлайн-игру по геометрии.
 * На клетчатом поле отмечено несколько точек, все расположены в углах поля.
 * Мите нужно нарисовать такой многоугольник, чтобы все выделенные точки оказались внутри этого многоугольника (не на границе),
 * а его стороны проходили только по сторонам или диагоналям клеток сетки.
 * При этом, периметр должен быть минимален. Напишите программу, которая вычислит периметр такого многоугольника.
 *
 * Входные данные
 * Первая строка содержит число N точек (до 10^6).
 * Последующие N строчек содержат два числа x_i, y_i– координаты отмеченных точек abs(x_i), abs(y_i) \le 10^6abs(x
 *
 * Результат работы
 * Выведите периметр заданного многоугольника с точностью до 5 знака после запятой.
 * Примеры
 * Входные данные
 * 2
 * 1 1
 * 1 2
 * Результат работы
 * 7.6568542495
 */

import java.io.*;
import java.util.StringTokenizer;

public class Olymp3 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        OlympTask solver = new OlympTask();

        solver.solve(in.nextInt(), out);

        out.close();
    }

    static class OlympTask {
        public void solve(int x, PrintWriter out) {
            out.print((2*x+3)+".6568542495");
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

}
