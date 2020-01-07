package com.company;

// взял вариант 1552.6
public class Main {
    enum Ballon {Green, Blue}

    public static void main(String[] args) {
        Ballon ballon = Ballon.Green;
        Ballon ballon1 = Ballon.Blue;
        Pig Pyatachok = new Pig(3, 2, "Пяточок");
        Robin Robin = new Robin(15, 15, "Кристофер Робин");
        Vinni Vinni = new Vinni(5, 5, "Винни-Пух");
        Robin.take(ballon);
        Robin.take(ballon1);
        Robin.hold(true);
        Vinni.hold(true);
        Robin.shot();
        Robin.gox(15);
        Vinni.gox(15);
        Robin.gox(15);
        Vinni.gox(15);
        Vinni.changecolor("темный как тучка");
        Vinni.getСolor();
        Robin.hold(false);
        Robin.shot();
Robin.inflate(20);
Robin.inflate(60);
Robin.inflate(30);

    }
}
