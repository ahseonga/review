package review;

public class Tv {
	//필드
	int ch;
	int vol;
	boolean power;
	String color;
	
	//메소드
	void powerOnOff() {
		System.out.println("Tv 전원을 껴고 큽니다.");
	}
	
	void chUp() {
		System.out.println("현재 채널 :" + ch);
		System.out.println("Tv 채널을 1 올립니다." + ++ch);
	}
	
	void chDown() {
		System.out.println("현재 채널 : " + ch);
		System.out.println("Tv 채널을 1 내립니다." + --ch);
	}

	
	//생성자(기본생성자)	
	//생성자 오버로딩 : 같은 이름의 생성자로 매개변수의 
	//타입, 개수, 순서가 다르면 선언이 가능하다.
	public Tv() {
		
	}

	public Tv(int ch, int vol, boolean power, String color) {
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = color;
	}

	public Tv(int ch, int vol, boolean power) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.power = power;
	}
}
