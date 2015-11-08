public class FroggerMain {
	public static void main(String[] args) {
		FroggerGame g = new Frogger();
		
		System.out.println(g.getGameName());
		System.out.println(g.getTeamMembers());
		g.playGame();
		
		System.exit(0);
	}
}
