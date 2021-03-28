
public class Mathieu{
	
	private static final User Mathieu = new User("Mathieu");;
	
	public static boolean mathieuGive(Waifu w, User u) {
		if(w.getPrice() < 300) return Mathieu.give(w,u);
		return Mathieu.me(w,u,w.getPrice()/3);
	}
}
