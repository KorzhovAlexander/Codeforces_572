
import java.util.Arrays;
import java.util.Scanner;


/*
5
*****
*...*
**.**
*...*
*****
2 2

5
*****
**.**
*..**
*...*
*****
3 2

* */
public class fourth {
    private static int pos;
    private static int[][] list;
    private static boolean[][] used;
    private static int rez;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pos = sc.nextInt();

        list = new int[pos][pos];
        for (int i = 0; i < pos; i++) {
            String scanner = sc.next();
            for (int j = 0; j < pos; j++) {
                list[i][j]=scanner.charAt(j);
            }
        }

        used = new boolean[pos][pos];

        find(sc.nextInt()-1,sc.nextInt()-1);
        System.out.println(" ");
        System.out.println(Arrays.deepToString(list));
        System.out.println(Arrays.deepToString(used));
        System.out.println(rez);
    }

    private static void find(int OX, int OY) {
        if ((list[OX][OY]==42) || (used[OX][OY])){
            return;
        }
        rez++;
        used[OX][OY] = true;
        if (list[OX][OY+1]!=42){
            find(OX,OY+1);
        }
        if (list[OX+1][OY]!=42){
            find(OX+1,OY);
        }
        if (list[OX-1][OY]!=42){
            find(OX-1,OY);
        }
        if (list[OX][OY-1]!=42){
            find(OX,OY-1);
        }

    }



}
