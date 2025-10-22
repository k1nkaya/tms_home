package lesson5_h;

import java.util.Scanner;

public class lesson5_hometask {
    public static void main(String[] args) {
        task1();
        task2();
    }

    //Задача 1
    public static void task1() {

        /*
        Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль.
        */

        System.out.println("Задача 1");

        Scanner input = new Scanner(System.in);

        System.out.println("Введите длинну массива");
        int n = input.nextInt();
        System.out.println("Введите ширину массива");
        int p =  input.nextInt();
        int[][] arr = new int[n][p];

        //заполнение массива числами  от 0 до 50
        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                arr[i][j] = (int)(51 * Math.random() + 0);
            }
        }

        //вывод исходного массива
        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Введите число которое нужно добавить к элементам массива ");
        int num = input.nextInt();
        int sum = 0;

        //вывод измененного массива и расчет суммы
        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                arr[i][j] = arr[i][j] + num;
                sum = sum + arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(sum + " сумма всех элементов массива ");
    }
    //Задача 1

    //Задача 2
    public static void task2() {

        /*
        Задача 2:
        Создать программу для раскраски шахматной доски с помощью цикла. Создать
        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        B(Black) или W(White).
        */

        System.out.println("Задача 2");

        String[][] arr = new String[8][8];

        //заполнение клеток
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
            }
        }

        //Вывод массива
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Задача 2
}
