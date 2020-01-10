package com.company;

class Vinni extends Living {
	public Vinni(int weight) {
		super(weight);
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
		System.out.format("%s стал %s\n", getName(), getColor());
	}
	
	@Override
	public void shot() {
		System.out.println("Пух не ладит с оружием");
	}
	
	@Override
	public String getName() {
		return "Винни-Пух";
	}
}
