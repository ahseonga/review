package classTest02;

public class MarvelMain {
	public static void main(String[] args) {
		MarvelHero ironMan = new MarvelHero("아이언맨", "에너지빔", 40);
		
		MarvelHero hulk = new MarvelHero();

		ironMan.name = "아이언맨";
		ironMan.age = 40;
		ironMan.Superpower = "에너지 빔";
		
		hulk.name = "헐크";
		hulk.age = 35;
		hulk.Superpower = "근력파워";
		
		ironMan.heroInfo();
		hulk.heroInfo();
		
		hulk.performAction();
//		
		
}
}