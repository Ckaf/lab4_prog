package com.company;

import com.company.Enums.BalloonColor;

class Robin extends Living {
	int sumx = 0;
	
	Robin(int weight, int force) {
		super(weight, force);
	}
	
	@Override
	public void goToX(int x) {
		System.out.println("Робин переместился из точки " + sumx + " в точку " + (sumx + x));
		sumx = sumx + x;
	}
	
	@Override
	public void hold(boolean force) {
		if (force)
			System.out.println("Робин держит шар");
		else {
			if (isHoldingBalloon == 1)
				System.out.println("Шарик улетел");
			else {
				System.out.println("Винни-Пух взлетает");
				isFlying = 1;
			}
		}
		if (isWithBurstBalloon == 2)
			System.out.println("Робин держит лопнутый шарик");
	}
	
	@Override
	public void changeColor(String color) {
	}
	
	@Override
	public void shot() {
		if (isFlying == 1) {
			if (Math.random() > 0.5) {
				System.out.println("Робин стреляет по шарику");
				isFlying = 0;
				
				System.out.println("Винни-Пух падает на землю");
			} else System.out.println("Промах");
		} else System.out.println("А зачем шары портить?");
	}
	
	@Override
	public void take(BalloonColor balloonColor) {
		if (balloonColor == BalloonColor.GREEN) System.out.println("Робин взял зеленый шарик");
		else System.out.println("Робин взял синий шарик");
	}
	
	@Override
	public void inflate(int value) {
		System.out.print("Робин");
		Balloon.inflate(value);
	}
	
	@Override
	public String getName() {
		return "Робин";
	}
}
