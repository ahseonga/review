package calculator;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(); //객채생성(인스턴스화)
		calculator.input();
		System.out.println("결과는 : " + calculator.calculate());
		
	}
}
