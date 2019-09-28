package september;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class third {
    private static final String PATTERN =
            "([\\:\\<|\\;\\<]-*[)\\\\])|([(\\\\]-*[\\:\\<|\\;\\<])|([\\:\\<|\\;\\<]-*[\\]\\<])|([\\[\\<]-*[\\:\\<|\\;\\<])";

    public static void main(String... args) {
        final Scanner input = new Scanner(System.in);
        final String message = input.nextLine();

        final Pattern pattern = Pattern.compile(PATTERN);
        final Matcher matcher = pattern.matcher(message);
        int count = 0;
        while (matcher.find())
            count++;
        System.out.println(count);    // prints 3
    }
}
