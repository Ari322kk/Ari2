package com.company;

import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        String value = "Красный";
        switch (value){
            case "Красный":  //case это "случай"
                System.out.println("Вы агрессивный и вспыльчивый");
                break;
            case "Оранжевый":
                System.out.println("Вы очень веселый");
                break;
            case "Белый":
                System.out.println("Вы добрый и мягкий");
                break;



        }
        if(value=="Оранжевый" || value.length()>3) {
            printText("Оранжевый", "this is color", 662);
            System.out.println(sum(33,22));

        }
    }
    public static  void print(){
        System.out.println("Проверка прошла");
        System.out.println("Проверка прошла");
        System.out.println("Проверка прошла");
    }
    public static  void  printText(String text, String SecondText,int a){
        System.out.println(text+" "+SecondText+" "+a);

    }
    public static int sum(int a ,int b){
        return a*b+(a*b+a*b);
    }
}








