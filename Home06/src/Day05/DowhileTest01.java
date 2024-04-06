package Day05;

import java.util.Scanner;

public class DowhileTest01 {
	public static void main(String[] args) {
		
		
		boolean isTrue = false;
		//메뉴를 선택하는 경우?
		//데이터 처리할때 
		
		
		while(isTrue) {
			System.out.println("출력 :");
		}
		do {
			System.out.println("송아성 : ");
		}while(isTrue);
		//사용자로부터 숫자를 입력받아서 해당 숫자가 양수인지 검사
		//입력된 숫자가 양수가 아니라면 사용자에게 다시 입력하라는 
		//메시지 출력하고 다시 입력받기
		//입력된 숫자가 양수일 경우만 양수입니다 출력
		
		
		//1) 입력클래스 import
		//2) 숫자 저장할 변수
		//3) do{
		//4) 	숫자 입력 메시지 출력
		//5) 	변수 nextInt() 사용
		//6) 	조건문(if) {
		//7) 	양수가 아닙니다 출력 }
		//8) }while(양수인 조건)
		//9) 출력
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num <= 0) {					// <=0을 써주어야 무한루프에 빠지지 않는다. 이부분은 이해가 간다.
			System.out.println("숫자 입력 : ");
			num = sc.nextInt();
			if(num <= 0) {
				System.out.println("양수가 아닙니다. ");
			}
		}
			System.out.println(num + " 양수입니다.");
		
		
				
		
		
	
		
		
		
		
		
		
	}
}

