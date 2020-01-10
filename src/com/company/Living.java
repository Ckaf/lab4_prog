package com.company;

import com.company.Enums.BalloonColor;
import com.company.Interfaces.*;

abstract class Living implements IMovable, IChangeable, IHoldable, IShotable, IInflatable, ITakable, INameable {
	protected int coordinateCurrent;
	protected String color;
	
	protected int weight;
	
	protected int isFlying = 0;
	protected int isHoldingBalloon = 0;
	protected int isWithBurstBalloon = 0;
	
	
	public Living(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void changeColor(String color) {
	}
	
	@Override
	public void addToCoordinate(int coordinateAddition) {
		int coordinateDestination = coordinateCurrent + coordinateAddition;
		System.out.format("%s переместился из точки %d в точку %d\n", getName(), coordinateCurrent, coordinateDestination);
		coordinateCurrent = coordinateDestination;
	}
	
	@Override
	public void take(BalloonColor balloon) {
		System.out.format("%s взял %s шарик\n", getName(), balloon.getName());
	}
	
	@Override
	public void inflate(int value) {
		System.out.format("%s %s\n", getName(), Balloon.inflate(value));
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getWeight() {
		return weight;
	}
}
