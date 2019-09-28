package october;

//Задача 4
//        Илья изучает свойства делимости и тренируется в разложении чисел на простые множители.
//        В качестве тренировки он хочет найти минимальный делитель NN,отличный от 1.Помогите Илье написать такую программу.
//Входные данные
//        6
//        Результат работы
//        2
import java.util.*;

public class Olymp4 {

    public static void main(String... args) {
        final Scanner input = new Scanner(System.in);
        final long n = input.nextInt();

        if (n % 2 == 0) {
            System.out.print(2);
        } else if (n % 3 == 0) {
            System.out.print(3);
        } else if (n % 5 == 0) {
            System.out.print(5);
        } else {
            long divisor = 5;
            int inc = 2;
            double sqrt = Math.ceil(Math.sqrt(n));

            while (divisor <= sqrt) {
                if (n % divisor == 0) {
                    System.out.print(divisor);
                    break;
                }
                divisor += inc;
                inc = 6 - inc;
            }
        }

    }

}
