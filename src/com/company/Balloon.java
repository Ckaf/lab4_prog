package com.company;

public class Balloon {
    private static int sumv=0;


    {

    }

// метод отвечающий за надувание(максимальный объем шара=100)
    public static void inflateb(int v) {
        sumv = sumv + v;
        if (sumv <= 100) {
            System.out.println(" надул шарик");
        }
        else System.out.println(" лопнул шарик");

    }

}
