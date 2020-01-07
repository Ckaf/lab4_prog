package com.company;

class Robin extends Living {
    Robin(int weight, int forse, String name) {
        super(15, 15, "Кристофер Робин");
    }


    boolean f = true;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robin robin = (Robin) o;
        return f == robin.f &&
                sumx == robin.sumx;
    }

    int sumx = 0;

    @Override
    public void gox(int x) {
        System.out.println("Робин переместился из точки " + sumx + " в точку " + (sumx + x));
        sumx = sumx + x;
    }


    @Override
    public void hold(boolean f) {

        if (f == true) System.out.println("Робин держит шар");
        else {
            if (flag1 == 1) System.out.println("Шарик улетел");
            else {
                System.out.println("Винни-Пух взлетает");
                flag = 1;
            }
        }
        if (flag2 == 2) System.out.println("Робин держит лопнутый шарик");
    }

    //переопределение hashcode, хотя в программе это не нужно
    @Override
    public int hashCode() {
        return flag;
    }

    @Override
    public void changecolor(String color) {

    }

    //переопределяем tostring(),хотя нам это ненужно
    @Override
    public String toString() {
        return "флаг=" + f;
    }

    @Override
    public void shot() {
        if ( flag == 1) {
            if (Math.random() > 0.5 ) {
                System.out.println("Робин стреляет по шарику");
                flag = 0;

                System.out.println("Винни-Пух падает на землю");
            }
            else System.out.println("Промах");
        }
     else System.out.println("А зачем шары портить?");
    }




    @Override
    public void take(Main.Ballon b) {
        if (b == Main.Ballon.Green) System.out.println("Робин взял зеленый шарик");
        else System.out.println("Робин взял синий шарик");
    }

    @Override
    public void inflate(int v) {
        System.out.print("Робин");
        Balloon.inflateb(v);
    }



}
