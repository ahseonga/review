package Home05;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//안녕하세요 000님 환영합니다. 10번 출력 (While문 써서 만들기)
//로직 구성
//1) 카운트 변수 선언
//2) while (카운트 변수 < 11) {
//3) 출력문(안녕하세요 000님 환영합니다)
//4) ++증감연산자
//		int cnt = 1;
//		String name = "송아성";
//		while (cnt < 11) {
//			System.out.println("안녕하세요 " + name + "님 " + "환영합니다");
//			cnt++;
		
//이름을 입력하면 안녕하세요 000님 환영합니다 10번 출력하기 (While문 써서 만들기)
// 1) 입력 클래스 import
// 2) 이름 변수선언
// 3) 카운트 변수(반복횟수를 조건식)
// 4) while문 {
// 5) 입력받을 메시지
// 6) 이름 입력 메소드
// 7) 출력 메시지
// 8) ++증감연산자

	Scanner sc = new Scanner(System.in);
	
	int cnt = 1;
	String name = "";
	
	System.out.println("이름을 입력해주세요");
	name = sc.nextLine();
	while (cnt < 11) {
		System.out.println("안녕하세요 " + name + "님 환영합니다.");
		cnt++;
	}
	
	
		
		
		}
 	}


