package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Вова";
        names[1] = "Дима";
        names[2] = "Алекс";


        for (int i = 0; i < 1; i++) {
            switch (names[i]) {
                case "Вова":
                    System.out.println("Доброе утро " + names[0]);

                case "Дима":
                    System.out.println("Добрый день " + names[1]);

                case "Алекс":
                    System.out.println("Добрый вечер " + names[2]);
            }

            System.out.println("hello " + names[0] + names[1] + names[2]);

        }
        /*System.out.println("Привет мир!");

        String hello = "Привет";
        String world = " Мир";
        System.out.println(hello + world);*/

       /* int a = 25;
        int b = 25;
        System.out.println(a+b);*/

        /*String name = "Асан";
        int age = 33;

        int temp = 6;


        if (age > 20 && age < 45 && temp < 30 && temp > -20) {
            System.out.println("То можно идти гулять");

            if (age < 20 && temp > 0 && temp < 28) {
                System.out.println("То мщжно гулять");
            }

            if (age > 45 && temp > -10 && temp < 25) {
                System.out.println("Можно идти гулять");
            }
        }*/

    }
}
