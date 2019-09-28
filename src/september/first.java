package september;

import java.util.Scanner;

/*
2
22 35
23 5
*/
public class first {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int[] a = new int[3];
        int min = Integer.MAX_VALUE;
        final int clients = in.nextInt();

        final String[] result = new String[2];

        for (int i = 0; i < clients; i++) {
            int time = in.nextInt() * 60 + in.nextInt();

            int q = 0;
            for (int j = 0; j < 2; j++) {
                if (a[j] < min) {
                    min = a[j];
                    q = j;
                }
                if (min <= time) {
                    a[q] = time + 30;
                    result[i] = a[q] / 60 + " " + a[q] % 60;
                }
                if (min > time) {
                    min = min + 30;
                    a[q] = min;
                    result[i] = min / 60 + " " + min % 60;
                }
            }
            System.out.println(result[i]);

        }
    }
}
