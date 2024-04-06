package calculatorTest01;

public class CalculatorTest001 {
	//필드 생성
	double num1, num2;
	char oper;
	
	//기본 생성자
	public CalculatorTest001() {
		this.num1 = 0;
		this.num2 = 0;
		this.oper = ' ';
	}
	
	//메소드생성 (매개변수 o , 리턴타입 x)
	void input (double num1, double num2, char oper) {
		System.out.println("첫번째 숫자 입력 : ");
		this.num1 = num1;
		System.out.println("두번쨰 숫자 입력 : ");
		this.num2 = num2;
		System.out.println("연산자를 입력하세요 (+,-,*,/) : ");
		this.oper = oper;
		
	}
	double calculate() {
		double result = 0;
		switch (this.oper) {
			case '+' : 
				result = this.num1 + this.num2;
				break;
			case '-' :
				result = this.num1 - this.num2;
				break;
			case '*' :
				result = this.num1 * this.num2;
				break;
			case '/' :
				if (num2 ==0) {
					System.out.println("0으로는 나눌 수 없습니다.");
				}
				result = this.num1 / this.num2;
				break;
			default : 
				System.out.println("잘못된 연산자입니다.");
		}
		return result;
		
	}
	
	
	

}
