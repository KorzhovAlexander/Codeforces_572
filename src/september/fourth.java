package september;

import java.util.Scanner;

public class fourth {
    public static void main (String[] args)  {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final int k = n*n;
        final int [] G = new int [k];
        for (int i = 0; i < G.length; i++) {
            G[i] = in.nextInt();
        }
        int j = 0, c = 0, s = 0;
        boolean f = true;
        for (int i = 0; i < k; i++) {
            if (G[i] != G[j]) {
                f=false;
                break;
            }
            if (c == n - 1) {
                c = 0;
                s++;
                j = s;
            } else {
                j = j + n;
                c++;
            }
        }
        for (int i = 0; i < k; i = i + n + 1) {
            if (G[i] != 0) {
                f = false;
                break;
            }
        }
        if (f) System.out.print("0"); else System.out.print("1");
    }
}
