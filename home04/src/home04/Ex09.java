package home04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
// 사용자로부터 과일 이름을 입력받아 해당하는 과일의 가격을 출력하기
// (사과: 1000원, 바나나: 1500원, 포도: 2000원, 기타: "가격 정보 없음")
	
		
	Scanner sc = new Scanner(System.in);
	
	int price = 0;
	
	System.out.println("과일 이름(사과, 바나나, 포도 중 하나)을 입력 :");
	String fruit = sc.nextLine();
	
	switch (fruit) {
	case "사과" :
		price = 1000;
		break;
	case "바나나" :
		price = 1500;
		break;
	case "포도" :
		price = 2000;
		break;
	default :
		System.out.println("가격 정보 없음");
	
	}	
	System.out.println(fruit + "가격은 " + price +"원입니다. ");
	
	}
}
