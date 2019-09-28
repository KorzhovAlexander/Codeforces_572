package september;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a = Math.abs(x1 - x2);
        int b = Math.abs(y1 - y2);

        if (a == 0) System.out.println(b + 1);
        else if (b == 0) System.out.println(a + 1);
        else {
            while (b > 0) {
                int c = a % b;
                a = b;
                b = c;
            }

            System.out.println(a + 1);
        }
    }
}
