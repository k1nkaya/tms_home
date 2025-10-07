package lesson1_h;

/*
Задача 1:
Написать приложение, которое будет вычислять и выводить значение по формуле:
a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
*/

public class task1 {
    public static void main(String[] args) {

        calculate();

    }

    //непосредственно метод выполняющий наши расчеты
    public static void calculate(){

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
}
