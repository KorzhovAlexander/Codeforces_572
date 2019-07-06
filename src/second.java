import java.util.Scanner;


/*
INPUT:
4
0 1 1 0
1 0 0 0
1 0 0 0
0 0 0 0
*/
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int rez=0;
        for (int i=0;i<max*max;i++){
                if (sc.nextInt()==1)
                    rez++;
        }
        System.out.println(rez/2);
    }
}
