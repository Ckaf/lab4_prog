package com.company;

abstract class Living implements traffic, puddle, Hold, gun, air, take {
    // флаг состояния полета
    public int flag = 0;
    // флаг отвечает за то, держит ли Винни-Пух шарик
    public int flag1 = 0;

    public int flag2 = 0;

    protected Living(int weight, int forse, String name) {

    }


    void getСolor() {
        System.out.println(color);
    }

    public String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void inflate(int v) {

    }


}