package com.company;

import com.company.Enums.BalloonColor;

class Vinni extends Living {
	int sumx = 0;
	
	Vinni(int weight, int force) {
		super(weight, force);
	}
	
	@Override
	public void goToX(int x) {
		System.out.println("Винни-Пух переместился из точки " + sumx + " в точку " + (sumx + x));
		sumx = sumx + x;
	}
	
	
	@Override
	public void hold(boolean force) {
		if (force)
			System.out.println("Винни-Пух держит шар");
		else {
			System.out.println("Винни-Пух отпустил шар");
			isHoldingBalloon = 1;
		}
	}
	
	@Override
	public void changeColor(String color) {
		setColor(color);
		System.out.println("Винни-Пух стал " + color);
	}
	
	@Override
	public void shot() {
		System.out.println("Пух не ладит с оружием");
	}
	
	@Override
	public void inflate(int v) {
		System.out.print("Винни-Пух");
		Balloon.inflate(v);
	}
	
	@Override
	public void take(BalloonColor balloonColor) {
		if (balloonColor == BalloonColor.GREEN)
			System.out.println("Винни-Пух взял зеленый шарик");
		else
			System.out.println("Винни-Пух взял синий шарик");
	}
	
	@Override
	public String getName() {
		return "Винни-Пух";
	}
}
