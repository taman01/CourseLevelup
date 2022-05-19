package ru.lvlup.homework.lesson2;

import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String[] args) {
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Введенные числа: " + a + " " + b + " " + c);

        if ((a < b) && (b < c)){
            System.out.println("Возрастающая последовательность: " + a + " " + b + " " + c);
        }else if ((b < a) && (a < c)){
            System.out.println("Возрастающая последовательность: " + b + " " + a + " " + c);
        }else if ((c < a) && (a < b)){
            System.out.println("Возрастающая последовательность: " + c + " " + a + " " + b);
        }else if ((a < c) && (c < b)){
            System.out.println("Возрастающая последовательность: " + a + " " + c + " " + b);
        }else if ((b < c) && (c < a)){
            System.out.println("Возрастающая последовательность: " + b + " " + c + " " + a);
        }else if ((c < b) && (b < a)){
            System.out.println("Возрастающая последовательность: " + c + " " + b + " " + a);
        }else {
            System.out.println("Числа равны. Возрастающая последовательность: " + a + " " + b + " " + c);
        }
    }
}
