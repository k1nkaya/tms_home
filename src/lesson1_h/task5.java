package lesson1_h;

import java.util.Scanner;

/*
Задача 5:
В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
на экран результат деления q на w с остатком. Пример вывода программы (для случая,
когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
*/

public class task5 {

    public static void main(String[] args) {

        calculate();

    }

    public static void calculate() {
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
}
