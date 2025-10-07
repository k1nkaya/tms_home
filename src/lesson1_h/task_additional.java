package lesson1_h;

import java.util.Scanner;

/*
Задача *:
Написать программу которая будет менять местами значение целочисленных
переменных. Пример:
int a = 1; int b = 2;
код (ваше решение)
sout(a); //выведет 2
sout(b); //выведет 1
*/

public class task_additional {

    public static void main(String[] args) {

        calculate();

    }

    //непосредственно метод выполняющий наши расчеты
    public static void calculate() {
        Scanner input = new Scanner(System.in);

        boolean check = true;

        //ввод a с клавиатуры и проверка(проверку на String не делал)
        double a = 0;
        while (check) {

            System.out.println("Введите целое число a = ");
            a = input.nextDouble();
            if (a % 1 != 0) {
                System.out.println("Вы ввели не целое число");
            } else check = false;
        }
        System.out.println(a);

        check = true;

        //ввод a с клавиатуры и проверка(проверку на String не делал)
        double b = 0;
        while (check) {

            System.out.println("Введите целое число b = ");
            b = input.nextDouble();
            if (b % 1 != 0) {
                System.out.println("Вы ввели не целое число");
            } else check = false;
        }
        System.out.println(b);

        //вариант через 3 переменные
        System.out.println("a = " + a + " b = " + b);
        double c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b);

        //вариант без добавления переменной
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);

        //вариант через XOR(исключающее ИЛИ)
        int v = (int)a;
        int s = (int)b;
        System.out.println("s = " + s + " v = " + v);
        v ^= s;
        s ^= v;
        v ^= s;
        System.out.println("s = " + s + " v = " + v);

    }
}
