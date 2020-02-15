package com.korzhov.app;

import java.util.Scanner;
// Саша устроился работать представителем Tinkoff и проходит обучение:
// в первый день, чтобы доставить карты клиентам, он прошел X метров.
// Путь каждого следующего дня получался длиннее на 70% от предыдущего дня.
// Саша хочет за все дни работы суммарно пройти не менее Y метров, на какой день он достигнет своей цели?

//NOTE:Типикал геометрическая прогрессия хз ваще я тупенький в матане мб ошибся

public class Olymp3 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double x = sc.nextDouble();
        final double y = sc.nextDouble();

        System.out.println((int) Math.ceil(Math.log(y / x) / Math.log(1.7)));
    }
}
