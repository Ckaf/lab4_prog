package com.company;

class Vinni extends Living {


    Vinni(int weight, int forse, String name) {
        super(5, 5, "Винни-Пух");

    }


    int sumx = 0;

    @Override
    public void gox(int x) {
        System.out.println("Винни-Пух переместился из точки " + sumx + " в точку " + (sumx + x));
        sumx = sumx + x;
    }


    @Override
    public void hold(boolean f) {
        if (f = true) System.out.println("Винни-Пух держит шар");
        else {
            System.out.println("Винни-Пух отпустил шар");
            flag1 = 1;
        }
    }


    @Override
    public void changecolor(String color) {
        setColor("");
        System.out.println("Винни-Пух стал " + color);
    }

    @Override
    public void shot() {

        System.out.println("Пух не ладит с оружием");
    }

    @Override
    public void inflate(int v) {
        System.out.print("Винни-Пух");
        Balloon.inflateb(v);

    }


    @Override
    public void take(Main.Ballon b) {
        if (b == Main.Ballon.Green) System.out.println("Винни-Пух взял зеленый шарик");
        else System.out.println("Винни-Пух взял синий шарик");
    }
}