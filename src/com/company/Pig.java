package com.company;

class Pig extends Living {
	public Pig(int weight) {
		super(weight);
	}
	
	@Override
	public void addToCoordinate(int coordinateAddition) {
		System.out.format("%s позавчера сломал лапу, и ему крайне трудно передвигаться.", getName());
	}
	
	@Override
	public void shot() {
		System.out.format("%s не имеет огнестрел.", getName());
	}
	
	@Override
	public void hold(boolean force) {
		System.out.format("%s больше не имеет шаров.", getName());
	}
	
	@Override
	public void inflate(int value) {
		System.out.format("%s считает что шарики удобнее дарить ненадутыми", getName());
	}
	
	@Override
	public String getName() {
		return "Пятячок";
	}
}
