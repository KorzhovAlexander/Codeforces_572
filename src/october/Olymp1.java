package october;

import java.util.Scanner;

public class Olymp1 {

    static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        long a = calculateFactorial(input.nextInt());
        while (a % 10 == 0) {
            a = a / 10;
        }
        System.out.println(a % 10);

    }
}
