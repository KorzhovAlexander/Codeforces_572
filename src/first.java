import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String message=in.nextLine().replace("  ","");
        String message=in.nextLine().replaceAll("^ | $| {2}","");

        int leng = message.length();
/**/
/*        if (message.substring(0,1).equals(" "))
            message.substring(0,1).re*/
        System.out.println(message);
    }
}
