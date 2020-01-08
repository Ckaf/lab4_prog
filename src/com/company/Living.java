package com.company;

import com.company.Interfaces.*;

abstract class Living implements IMovable, IChangeable, IHoldable, IShotable, IInflatable, ITakable, INameable {
	protected int isFlying = 0;
	
	protected int isHoldingBalloon = 0;
	
	protected int isWithBurstBalloon = 0;
	
	protected String color;
	
	protected Living(int weight, int force) {
	
	}
	
	void getColor() {
		System.out.println(color);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
