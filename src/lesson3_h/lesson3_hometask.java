package lesson3_h;

import java.util.Scanner;

public class lesson3_hometask {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    //Задача 1
    public static void task1() {

        /*
        Задача 1:
        Напишите программу, которая будет принимать на вход число из консоли и на выход
        будет выводить сообщение четное число или нет. Для определения четности числа
        используйте операцию получения остатка от деления (операция выглядит так: '% 2').
        */

        System.out.println("Задача 1");

        Scanner input = new Scanner(System.in);

        //ввод n с клавиатуры
        System.out.println("Введите число n =");
        int n = input.nextInt();

        //проверка на четность
        if(n % 2 == 0) {
            System.out.println(n +" - четное");
        }
        else
            System.out.println(n + " - нечетное");
    }
    //Задача 1

    //Задача 2
    public static void task2() {

        /*
        Задача 2:
        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
        */

        System.out.println("Задача 2");

        Scanner input = new Scanner(System.in);

        //ввод t с клавиатуры
        System.out.println("Введите температуру на улице t =");
        int t = input.nextInt();

        //проверка температуры
        if(t > -5) {
            System.out.println("Warm");
        }
        else if (t > -20)
            System.out.println("Normal");
        else
            System.out.println("Cold");
    }
    //Задача 2

    //Задача 3
    public static void task3() {

        /*
        Задача 3:
        Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        */

        System.out.println("Задача 3");

        for (int i = 10; i <= 20; i++) {
            System.out.println(i*i);
        }
    }
    //Задача 3

    //Задача 4
    public static void task4() {

        /*
        Задача 4:
        Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
        */

        System.out.println("Задача 4");

        for (int i = 1; i * 7 <= 98; i++) {
            System.out.println(i*7);
        }
    }
    //Задача 4

    //Задача *
    public static void task5() {

        /*
        Задача *:
        Напишите программу, где пользователь вводит любое целое положительное число. А
        программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        ввести некорректные данные.
        */

        System.out.println("Задача *");

        Scanner input = new Scanner(System.in);

        //инициализируем переменную типа boolean для работы цикла
        boolean validation = false;

        //ввод n с клавиатуры, проверка на ввод, расчет и вывод результата
        while (!validation) {
            //проверка ввод целого числа, если целое - переход к проверке на положительность, если нет, ввод нового числа
            System.out.println("Введите целое положительное число n = ");
            if (input.hasNextInt()) {
                int n = input.nextInt();

                //проверка введенного числа на положительность, если да, то рассчитываем и выводим результат
                if (n > 0) {
                    validation = true;
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum = sum + i;
                    }
                    System.out.println("Сумма всех положительных, целых чисел от 0 до " + n + " = " + sum);
                }
                else {
                    System.out.println("Вы ввели неположительное число, попробуйте снова");
                }
                //конец проверки на положительность
            }
            else {
                System.out.println("Вы ввели некорректные данные, попробуйте снова ");
                input.next();
            }
            //конец проверки на ввод
        }
    }
    //Задача *
}
