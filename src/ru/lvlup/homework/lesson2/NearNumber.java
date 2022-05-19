package ru.lvlup.homework.lesson2;

import java.util.Scanner;

public class NearNumber {
    public static void main(String[] args) {
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        Double enteredNumber1 = sc.nextDouble();
        Double enteredNumber2 = sc.nextDouble();

        if ((10 - enteredNumber1) < (10 - enteredNumber2)){
            System.out.println(enteredNumber1);
        }else {
            System.out.println(enteredNumber2);
        }
    }
}