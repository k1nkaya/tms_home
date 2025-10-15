package lesson4_h;

import java.util.Scanner;

public class lesson4_hometask {
    public static void main(String[] args) {
        task1();
        task2_4();
        task5();
        task6();
    }

    //Задача 1
    public static void task1() {

        /*
        Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        */

        System.out.println("Задача 1");

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = input.nextInt();
        int[] arr = new int[n];

        //заполнение массива числами  от 0 до 50
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(51 * Math.random() + 0);
        }

        //вывод массива с начала
        System.out.println("Вывод массива с начала");
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + "-й элемент  массива = " + arr[i]);
        }

        //вывод массива с конца
        System.out.println("Вывод массива с конца");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(i + "-й элемент  массива = " + arr[i]);
        }

    }
    //Задача 1

    //Задача 2,3,4
    public static void task2_4() {

        /*
        Задача 2:
        Найти минимальный-максимальный элементы и вывести в консоль.
        Задача 3:
        Найти индексы минимального и максимального элементов и вывести в консоль.
        Задача 4:
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        сообщение, что их нет.
        */

        System.out.println("Задача 2,3,4 вместе");

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = input.nextInt();
        int[] arr = new int[n];

        //заполнение массива числами  от 0 до 50
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(51 * Math.random() + 0);
        }

        int a = arr[0]; int k = 0; //индексы элемента а
        int b = arr[0]; int j = 0; //индекс элемента b
        int count = 0; //счетчик

        //вывод массива
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //поиск наименьшего и наибольшего элемента  массива путем сравнения и их индексов
        for(int i = 1; i < arr.length; i++){
            if(a > arr[i]){
                a = arr[i];
                k = i;
            }
            if(b < arr[i]){
                b = arr[i];
                j = i;
            }
        }

        //поиск нулевых элементов массива(задача 4)
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                count++;
            }
        }

        //вывод результатов
        System.out.println("\n" + (k + 1) + "-й элемент является наименьшим, его значение = " + a);
        System.out.println(j + 1 + "-й элемент является наибольшим, его значение = " + b);
        System.out.println("Количество нулевых элементов = " + count);

    }
    //Задача 2,3,4

    //Задача 5
    public static void task5() {

        /*
        Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д.
        */

        System.out.println("Задача 5");

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = input.nextInt();
        int[] arr = new int[n];

        //заполнение массива числами  от 0 до 50
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(51 * Math.random() + 0);
        }

        //вывод массива
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        //вывод перевернутого массива
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //Задача 5

    //Задача 6
    public static void task6() {

        /*
        Задача 6:
        Проверить, является ли массив возрастающей последовательностью (каждое следующее
        число больше предыдущего).
        */

        System.out.println("Задача 6");

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = input.nextInt();
        int[] arr = new int[n];

        //заполнение массива числами  от 0 до 50
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(51 * Math.random() + 0);
        }

        //вывод массива
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //сравнение всех элементов массива
        boolean check = false;
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i+1]) {
                check = true;
            }
            else {
                i = arr.length;
                check = false;
            }
        }
        if (check) {
            System.out.println("Массив возрастающая последовательность");
        }
        else {
            System.out.println("Массив не возрастающая последовательность");
        }
    }
    //Задача 6

}
