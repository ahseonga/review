package review;

public class TvMain {
	public static void main(String[] args) {
		Tv sTv = new Tv(); //객체화 작업(인스턴스화)
		System.out.println(sTv);
		sTv.power = true;
		System.out.println(sTv.power);
		System.out.println(sTv.ch);
		sTv.ch = 22;
		System.out.println(sTv.ch);
		//chUp() 매개변수 x, 리턴값 x  => 객체명.메소드명();
		sTv.chUp();
		
		//sTv 객체 매개변수 4개 있는 생성자로 만들기 //생성자 오버로딩 (매개변수 개수, 타입, 순서가 다르면 같은 이름으로 만들 수 있다!)
		Tv sTv2 = new Tv(50, 10, true, "black");
		System.out.println(sTv2);
		System.out.println(sTv2.ch);
		
		
		
		
		
		
		
		
	}
}
