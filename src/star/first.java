package star;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final String message=in.nextLine().replaceAll("^ | $| {2}","");
        System.out.println(message);
    }
}
