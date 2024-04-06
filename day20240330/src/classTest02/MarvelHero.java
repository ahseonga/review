package classTest02;

public class MarvelHero {
	
	//필드
	String name;
	String Superpower;
	int age;
	
	//메소드
	//히어로 정보 출력 메소드
	void heroInfo() {
		System.out.println("마블 히어로 이름 : " + name);
		System.out.println("슈퍼파워 : " + Superpower);
		System.out.println("나이 : " + age);
	}
	
	//히어로 액션 메소드
	void performAction() {
		System.out.println(name + "이/가 슈퍼파워를 사용합니다");
	}

	
	//생성자 (alt + shift + s + o)	
//	public MarvelHero() {
//		
//	}

	public MarvelHero(String name, String superpower, int age) {
		this.name = name;
		Superpower = superpower;
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
