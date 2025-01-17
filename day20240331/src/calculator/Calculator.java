package calculator;

import java.util.Scanner;

public class Calculator {
	// 계산기 프로그램 
	// 사용자로부터 입력받은 두 숫자와 연산자를 입력받아 연산을 연산을 수행하는 계산기 프로그램
	// 사용자가 0으로 나누는 경우 예외처리
	
	//필드 생성
	double num1, num2;
	char oper;
	
	//기본 생성자 생성
	public Calculator() {
		this.num1 = 0;
		this.num2 = 0;
		this.oper = ' ';
	}
	
	//메소드 생성
	
	void input(double num1, double num2) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		this.num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		this.num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		this.oper = sc.next().charAt(0);
		}
	
	int calculate() {
		int result = 0;
		switch (this.oper) {
		case '+' :
			result = (int) (this.num1 + this.num2);
			break;
		case '-':
			result = (int) (this.num1 - this.num2);
			break;
		case '*':
			result = (int) (this.num1 * this.num2);
			break;
		case '/' :
			if (num2 == 0) {
				System.out.println("0으로는 나눌 수가 없습니다.");
				return 0;
			}
			result = (int) (this.num1 / this.num2);
			break;
		default : 
			System.out.println("잘못된 연산자입니다.");			
		}
		return result;
	}
	
}
