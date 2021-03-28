import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
	private String name;
	private List<Waifu> harem;
	private int haremSize;
	private int pokedexSize;
	private Map<React,Integer> reactKakera;
	private int kakera;
	private int key;
	private Map<Badge,Integer> badge;
	
	public User(String name) {
		this.name = name;
		this.harem =  new ArrayList<Waifu>();
		this.haremSize = 0;
		this.pokedexSize = 0;
		for (React r : React.values()) {
			reactKakera.put(r, 0);
		}
		this.kakera = 0;
		this.key = 0;
		for(Badge b : Badge.values()) {
			badge.put(b, 0);
		}
	}
	
	public boolean give(Waifu w, User u) {
		if(this.harem.contains(w)) {
			u.harem.add(w);
			this.harem.remove(w);
			return true;
		}
		return false;
	}
	
	public boolean givek(int k, User u) {
		if(this.kakera >= k) {
			u.kakera+=k;
			this.kakera-=k;
			return true;
		}
		return false;
	}
	
	public boolean me(Waifu w, User u, Waifu w1) {
		if(!this.give(w, u)) return false;
		if(!u.give(w1,this)) {
			u.give(w,this);
			return false;
		}
		return true;
	}
	
	public boolean me(Waifu w, User u, int k) {
		if(!this.give(w, u)) return false;
		if(!u.givek(k,this)) {
			u.give(w,this);
			return false;
		}
		return true;
	}
}
