package lesson1_h;

import java.util.Scanner;

/*
Задача 4:
В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
программу, округляющую число n до ближайшего целого и выводящую результат на
экран.
*/

public class task4{

    public static void main(String[] args) {

        calculateEasy();
        calculateHard();

    }

    public static void calculateEasy() {
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
    public static void calculateHard() {
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
}
