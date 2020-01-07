package com.company;

class Pig extends Living {

    protected Pig(int weight, int forse, String name) {
        super(weight, forse, name);
    }



    @Override
    public void gox(int x) {
        System.out.println("Пятачок позавчера сломал лапу, и ему крайне трудно передвигаться");

    }


    @Override
    public void shot() {
        System.out.println("У Пятачка нет огнестрела");
    }

    @Override
    public void hold(boolean f) {
        System.out.println("У Пятачка не осталось шаров");
    }

    @Override
    public void changecolor(String color) {

    }
// пятачок не будет надувать шарики, ему влом
    @Override
    public void inflate(int v) {
        System.out.println("Шарики удобнее дарить ненадутыми");

    }

    @Override
    public void take(Main.Ballon ballon) {
        if (ballon== Main.Ballon.Green) System.out.println("Пятачок взял зеленый шарик");
        else System.out.println("Пятачок взял синий шарик");
    }
}
