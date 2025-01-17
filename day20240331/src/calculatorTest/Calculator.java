package calculatorTest;

import java.util.Scanner;

public class Calculator {
//	계산기 프로그램
//	   사용자로부터 입력받은 두 숫자와 연산자를 입력받아 연산을 수행하는 계산기 프로그램
//	   사용자가 0으로 나누는 경우 예외처리
	//필드 생성
	double num1, num2;
	char oper;
	
	//생성자 : 기본생성자() - 초기값 할당
	public Calculator() {
		this.num1 = 0;
		this.num2 = 0;
		this.oper = ' ';
		
	}
	
	//메소드 생성
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		this.num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		this.num2 = sc.nextInt();
		System.out.println("연산자를 입력해주세요(+,-,*,/) : ");
		char inputOper = sc.next().charAt(0);
		while (!(inputOper == '+' || inputOper == '-' || inputOper == '*' || inputOper == '/')) {
			System.out.println("연산자를 잘못 입력하셨습니다. 연산자를 다시 입력해주세요. ");
			System.out.print("연산자를 입력해주세요(+,-,*,/) : ");
			 inputOper = sc.next().charAt(0);
		}
		this.oper = inputOper;
		
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