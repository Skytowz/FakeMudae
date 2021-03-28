
public enum Roulette {
	GameRoulette("Game roulette"), AnimangaRoulette("Animanga Roulette");
	private String type;
	
	Roulette(String type){
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}
}
