import java.util.List;

public class Waifu {
	private final static int ZERO = 0;
	private String name;
	private Roulette type;
	private int price;
	private int rankClaim;
	private int rankLike;
	private List<String> aliasList;
	private String alias;
	
	public Waifu(String name, Roulette type, List<String> aliasList) {
		this.name = name;
		this.type = type;
		this.aliasList = aliasList;
		this.alias = aliasList.get(0);
		this.price = ZERO;
		this.rankClaim = ZERO;
		this.rankLike = ZERO;
	}
	
	public int getPrice() {
		return this.price;
	}
}
