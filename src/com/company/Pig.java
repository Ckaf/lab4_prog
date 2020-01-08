package com.company;

import com.company.Enums.BalloonColor;

class Pig extends Living {
	protected Pig(int weight, int force) {
		super(weight, force);
	}
	
	@Override
	public void goToX(int x) {
		System.out.println("Пятачок позавчера сломал лапу, и ему крайне трудно передвигаться");
	}
	
	@Override
	public void shot() {
		System.out.println("У Пятачка нет огнестрела");
	}
	
	@Override
	public void hold(boolean force) {
		System.out.println("У Пятачка не осталось шаров");
	}
	
	@Override
	public void changeColor(String color) {
	}
	
	@Override
	public void inflate(int v) {
		System.out.println("Шарики удобнее дарить ненадутыми");
	}
	
	@Override
	public void take(BalloonColor balloon) {
		if (balloon == BalloonColor.GREEN) System.out.println("Пятачок взял зеленый шарик");
		else System.out.println("Пятачок взял синий шарик");
	}
	
	@Override
	public String getName() {
		return "Пятячок";
	}
}
