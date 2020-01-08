package com.company.Enums;

public enum BalloonColor {
	GREEN("Зеленый"),
	BLUE("Голубой");
	
	private String name;
	
	BalloonColor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
