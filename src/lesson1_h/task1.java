package lesson1_h;

/*
Задача 1:
Написать приложение, которое будет вычислять и выводить значение по формуле:
a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4easy();
        task4hard();
        task5();
        task_additional();

    }

    //непосредственно метод выполняющий наши расчеты
    public static void task1(){

        //инициализация и присвоение чисел b и c
        int b = 250;
        int c = 99;

        //инициализация и присвоение числа a
        int a = 4 * (b + c - 1) / 2;

        //вывод значений b и с
        System.out.println("b = "+ b + ", c = "+ c);

        //вывод значения a
        System.out.println("4 * (b + c - 1) / 2 = a = " + a);

    }
    public static void task2() {
        Scanner input = new Scanner(System.in);

        //инициализируем переменную n которую будем вводить
        double n = 0;

        //ввод n с клавиатуры и проверка(проверку на String не делал)
        while ((n < 9 || n > 100) || (n % 1) != 0 ) {
            System.out.println("Введите целое двухзначное число n = ");
            n = input.nextDouble();

        }

        //вывод числа введенного пользователем
        System.out.println("Вы ввели число n = " + n);

        //остаток от деления n на 10 == кол-во единиц
        int a = (int)n % 10;

        //поиск количества десятков
        int b = ((int)n - a) / 10;

        //вывод кол-ва десятков и единиц
        System.out.println("Число "+ n + " состоит из " + b + " десятков и " + a + " единиц");

        //инициализируем переменную sum и рассчитываем  ее значение
        int sum = b + a;

        //ввывод результата sum
        System.out.println("Сумма десятков и единиц числа " + n + " = " + sum);


    }
    public static void task3() {
        Scanner input = new Scanner(System.in);

        //инициализируем переменную n которую будем вводить
        double n = 0;

        //ввод n с клавиатуры и проверка(проверку на String не делал)
        while ((n < 100 || n > 1000) || (n % 1) != 0 ) {
            System.out.println("Введите целое трехзначное число n = ");
            n = input.nextDouble();

        }

        //вывод числа введенного пользователем
        System.out.println("Вы ввели число n = " + n);

        //остаток от деления n на 10 == кол-во единиц
        int a = (int)n % 10;

        //поиск количества десятков
        int c = (((int) n % 100 -  a) / 10);

        //поиск количества сотен
        int b = (((int)n - (int)n % 100) / 100);

        //вывод кол-ва десятков и единиц
        System.out.println("Число "+ n + " состоит из "+ b + " сотен, " + c + " десятков и " + a + " единиц");

        //инициализируем переменную sum и рассчитываем  ее значение
        int sum = b + a + c;

        //ввывод результата sum
        System.out.println("Сумма сотен, десятков и единиц числа " + n + " = " + sum);

    }
    public static void task4easy() {
        Scanner input = new Scanner(System.in);

        System.out.println("Вариант решения задачи без метода Math.round");

        //инициализируем переменную n которую будем вводить
        double n = 0;

        //ввод n с клавиатуры и проверка(проверку на String не делал)
        while ( n % 1 == 0 ) {
            System.out.println("Введите вещественное число n = ");
            n = input.nextDouble();
        }

        //поиск дробной части числа n
        double a = n - (int)n;

        //сравнение дробной части числа n с 0.5
        if( a < 0.5 ) {

            //если a < 0.5 округление в меньшую сторону
            System.out.println(n - a);
        }
        //если а >= 0.5 округление в большую сторону
        else System.out.println(n+1-a);

    }
    public static void task4hard() {
        Scanner input = new Scanner(System.in);

        System.out.println("Вариант решения задачи c методом Math.round");

        //инициализируем переменную n которую будем вводить
        double n = 0;

        //ввод n с клавиатуры и проверка(проверку на String не делал)
        while ( n % 1 == 0 ) {
            System.out.println("Введите вещественное число n = ");
            n = input.nextDouble();
        }

        //используем  метод Math.round для округления в ближайшую сторону
        n = Math.round(n);

        //Вывод результата округления
        System.out.println(n);

    }
    public static void task5() {
        Scanner input = new Scanner(System.in);

        //инициализируем переменные q и w которые будем вводить
        double q = 0;
        double w = 0;

        //ввод q с клавиатуры и проверка(проверку на String не делал)
        while ((q <= 0) || (q % 1) != 0) {
            System.out.println("Введите натуральное число q = ");
            q = input.nextDouble();
        }
        //ввод w с клавиатуры и проверка(проверку на String не делал)
        while ((w <= 0) || (w % 1) != 0) {
            System.out.println("Введите натуральное число w = ");
            w = input.nextDouble();
        }

        //расчет остатка и результата деления q на w
        int mod = (int)(q % w);
        int div = (int)(q / w);

        System.out.println("q / w = " + div + " и " + mod + " в остатке");
    }
    public static void task_additional() {
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

    }
}
