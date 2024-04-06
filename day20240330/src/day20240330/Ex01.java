package day20240330;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//5칸 짜리 사물함의 비밀번호를 설정하고, 사용자에게 이용할 사물함 번호와 비밀번호를 입력하게 하고,
		//입력된 비밀번호와 사물함의 비밀번호를 비교하여 일치 여부 출력하기(배열이용)
		
		//1) 입력 클래스 import
		//2) 5칸 짜리 사물함 비밀번호 설정
		//3) 변수 선언(문자열 변수 4, 입력받을 번호 정수형 변수 2)
		//4) 사용자에게 이용할 사물함 번호 입력메소드
		//3) 사용자에게 비밀번호 번호 입력메소드
		//4) 일치/불일치 확인 (if ~ else문)
		
		Scanner sc = new Scanner(System.in);
		
		int[] arpw = new int[5];
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		String choiceMsg = "이용할 사물함의 번호 입력 : ";
		String inputMsg = "비밀번호 입력 : ";
		String result = "";
		int lockerNumber = 0;
		
		int choice = 0, inputpw = 0;
		
		//for문
		for (int i = 0; i < arpw.length; i++) {
			System.out.println(i + 1 + mainMsg); 
			arpw[i] = sc.nextInt();
		}
		do { 
			  System.out.print(choiceMsg);
	            lockerNumber = sc.nextInt();
	            if (lockerNumber < 1 || lockerNumber > 5) { //1보다 작거나 5보다 크면 무한 반복!
	                System.out.println("사물함번호는 1부터 5까지 입니다. 다시 입력해주세요");
	            }
	        } while (lockerNumber < 1 || lockerNumber > 5); //사용자가 올바른 범위의 번호를 입력 시 무한 반복하는 'do ~ while' 루프 종료
		
		
		choice = sc.nextInt();
		
		System.out.println(inputMsg);
		inputpw = sc.nextInt();
		
		
		//조건문(if ~ else문)
		if(arpw[choice -1] == inputpw) {
			result = "비밀번호 일치합니다";
		} else {
			result = "비밀번호 불일치합니다";
		}
		
		System.out.println(choice+ "번의 " + result);
		
	}
}
