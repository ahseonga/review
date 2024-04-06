package home04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
// 사용자로부터 사칙연산(+, -, *, /) 중 하나를 입력받아 두 개의 정수에 대해 해당 연산을 수행하여 결과를 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아래에 사칙연산(+, -, *, /) 중 하나를 입력 : ");
        char op = sc.next().charAt(0);

        System.out.println("두 개의 정수를 입력: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();

        int result = 0;

        // swtich 구문 이용
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
                }  
        System.out.println("결과 값 : " + result);
        
	}
}