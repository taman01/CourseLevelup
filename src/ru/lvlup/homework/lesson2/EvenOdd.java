package ru.lvlup.homework.lesson2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();

        if (enteredNumber %2 == 0){
            System.out.println("Введенное число четное");
        }else {
            System.out.println("Введенное число нечетное");
        }
    }
}
