package com.company;

class Robin extends Living {
	private int weightVinnie;
	
	public Robin(int weight, Living vinnie) {
		super(weight);
		weightVinnie = vinnie.getWeight();
	}
	
	@Override
	public void hold(boolean force) {
		if (force)
			System.out.println("Робин держит шар");
		else {
			if (isHoldingBalloon == 1)
				System.out.println("Шарик улетел");
			else {
				if (weightVinnie <= 20) {
					System.out.println("Винни-Пух взлетает");
					isFlying = 1;
				} else {
					System.out.println("Винни-Пух не взлетает");
					isFlying = 0;
				}
			}
		}
		if (isWithBurstBalloon == 2)
			System.out.println("Робин держит лопнутый шарик");
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
	public String getName() {
		return "Робин";
	}
}
