
import java.util.Arrays;
import java.util.Scanner;


/*
5
*****
*...*
**.**
*...*
*****

* */
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos = sc.nextInt();

        char[][] list = new char[pos][pos];
        for (int i = 0; i < pos; i++) {
            String scanner = sc.next();
            for (int j = 0; j < pos; j++) {
                list[i][j]=scanner.charAt(j);
            }
        }

        boolean[] used = new boolean[list.length];
    }


}
