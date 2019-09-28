package october;
import java.util.Scanner;

public class Olymp2 {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        final short[] arr = new short[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextShort();
        }
        int minimum, diff = -1;
        minimum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            diff = Math.max(diff, arr[i] - minimum);
            minimum = Math.min(minimum, arr[i]);
        }

        int f = 0;
        int s = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i]==(diff+minimum)) s=i+1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==minimum) f=i+1;
        }
        System.out.println(f+" "+s);
    }
}
