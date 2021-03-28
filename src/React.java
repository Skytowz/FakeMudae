import java.util.Random;

public enum React {
	PURPLE(100,100), BLUE(100,150), TURQUOISE(175,249), GREEN(250,300), YELLOW(400,500), ORANGE(700,799), RED(1400,1499), RAINBOW(3000,3099), LIGHT;
	
	private int smallPrice;
	private int bigPrice;
	private React[] light = new React[3];
	
	React(int i, int j) {
		this.smallPrice = i;
		this.bigPrice = j;
	}

	React() {
		int pick;
		for(int i = 0; i<3; i++) {
			pick = new Random().nextInt(React.values().length-1);
			light[i] = React.values()[pick];
		}
	}
}
