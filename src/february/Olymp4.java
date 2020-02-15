package com.korzhov.app;

//Дан граф и точка входа, обойти и найти все "." которые связаны

// Входные данные
// 5
// *****
// *...*
// **.**
// *...*
// *****
// 2 2

//Результат работы
//7
import java.util.Scanner;

public class Olymp4 {
    private static int[][] list;
    private static boolean[][] used;
    private static int rez;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int pos = sc.nextInt();

        list = new int[pos][pos];
        for (int i = 0; i < pos; i++) {
            String scanner = sc.next();
            for (int j = 0; j < pos; j++) {
                list[i][j]=scanner.charAt(j);
            }
        }

        used = new boolean[pos][pos];

        find(sc.nextInt()-1,sc.nextInt()-1);
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
