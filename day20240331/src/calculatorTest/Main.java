package calculatorTest;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); //입력클래스 import 
	        Calculator calculator = new Calculator(); //객체 생성(인스턴스
	        calculator.input(); //매개변수x , 리턴값 x 출력메소드 사용
	        System.out.println(calculator.calculate()); //매개변수 x , 리턴값 o 출력메소드 사용 
	        sc.close(); // 입력이 완료되면 스캐너를 닫아줍니다.
}
}

