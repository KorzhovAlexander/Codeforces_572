package september;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt(); // количество точек
        double pl_max = 0;

        ArrayList<Point> al = new ArrayList<Point>();
        for (int i = 0; i < n; i++) {
            Point p = new Point();
            p.x = in.nextInt();
            p.y = in.nextInt();
            al.add(p);
        }

        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++) {
                    double prr = (pl(al.get(i), al.get(j), al.get(k)));
                    if (prr > pl_max) {
                        pl_max = prr;
                    }
                }
        System.out.println(new DecimalFormat("#.###############").format(pl_max)
        );
    }

    private static double pl(Point i, Point j, Point k) {
        return .5 * Math.abs((j.x - i.x) * (k.y - i.y) - (k.x - i.x) * (j.y - i.y));
    }
}
