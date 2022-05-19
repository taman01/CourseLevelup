package ru.lvlup.homework.lesson2;

import java.util.Random;

public class TripleNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int secretNumber = r.nextInt(900) + 100;
        System.out.println("Случайное число - " + secretNumber);
        int lastdigit = secretNumber % 10;
        int seconddigit = (secretNumber / 10) % 10;
        int firstdigit = secretNumber / 100;

        if ((firstdigit > seconddigit) && (firstdigit > lastdigit)){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + firstdigit + ".");
        }else if ((seconddigit > firstdigit) && (seconddigit) > lastdigit){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + seconddigit + ".");
        }else if ((lastdigit > firstdigit) && (lastdigit > seconddigit)){
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + lastdigit + ".");
        }else System.out.println("Все цифры равны");
    }
}
