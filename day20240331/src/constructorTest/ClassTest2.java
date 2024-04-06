package constructorTest;

class B {
	//필드
	int num;
	
	//메소드
	void printNum(int num) {
		System.out.println("num :" + num);
		System.out.println("필드 num : " + this.num); //기본값 0이 출력
		System.out.println("참조 값 : " + this); //this는 b1과 같다!
		
	}
	//생성자

	public B(int num) { //int num은 매개변수!
		this.num = num;
	}
	
	//기본생성자 
	public B() {
	}
		
		
		
	}



public class ClassTest2 {
	public static void main(String[] args) {
		B b1  = new B();
		b1.printNum(10);
		B b2 = new B();
		b2.num = 100;
		b2.printNum(5);
		System.out.println(b2);
		
		
		
		
		
	}
}
