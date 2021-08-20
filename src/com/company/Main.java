package com.company;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum(generateRandomAge(), 29));
        System.out.println(sum(generateRandomAge(), 19));
        System.out.println(sum(generateRandomAge(), 5));
        System.out.println(sum(generateRandomAge(), 28));
        System.out.println(sum(generateRandomAge(), 29));

    }

    public static String sum(int age, int temperature) {

        if (age >= 20 && age <= 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять1");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять2");
        } else {
            System.out.println("Оставайся дома");
        }
        return "Age " + age + " Temperature " + temperature;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int a = random.nextInt(81);
        System.out.println(a);
        return a;
    }
}









