package calculatorTest01;

public class Main {
	public static void main(String[] args) {
		//객체 생성
		CalculatorTest001 calculator = new CalculatorTest001();
		//메소드 호출 2개
		calculator.input(30, 20, '/');
		System.out.println(calculator.calculate());
	}
}
