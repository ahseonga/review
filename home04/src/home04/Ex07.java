package home04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
//사용자로부터 1에서 7까지의 숫자를 입력받아 해당하는 요일을 출력하기 
//(1이면 "월요일", 2이면 "화요일", ..., 7이면 "일요일")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1에서 7까지 숫자 하나만 입력 : ");
		int number = sc.nextInt();
		String week = "";
		
		switch (number) {
		case 1 : 
			week = "월요일";
			break;
		case 2 :
			week = "화요일";
			break;
		case 3 : 
			week = "수요일";
			break;
		case 4 :
			week = "목요일";
			break;
		case 5 :
			week = "금요일";
			break;
		case 6 : 
			week = "토요일";
			break;
		case 7 :
			week = "일요일";
			break;
		default :
			System.out.println("숫자를 잘못 입력했습니다. 다시 입력해주세요? ");
			break;
		}
		System.out.println("해당 숫자의 요일 : " + week);
	}
}
