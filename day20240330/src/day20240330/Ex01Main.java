package day20240330;

import java.util.Scanner;

public class Ex01Main {
	//비밀번호 설정 메소드
	// setLockerPw 매개변수 o, 리턴값 o
	static int[] setLockerPw(int length, Scanner sc) {
		int[] arPw = new int[length];
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		for (int i =0; i < arPw.length; i++) {
			System.out.println(i + 1 + mainMsg);
			arPw[i] = sc.nextInt();		
			}
		return arPw;
	}
	
	//비밀번호 일치 여부 메소드
	//checkLockerPw 매개변수 o, 리턴값 o
	String checkLockerPw(int lockerPw, int inputPw) {
		String result = "";
		if (lockerPw == inputPw) {
			result = "비밀번호가 일치합니다";
		}else {
			result = "비밀번호가 불일치합니다 다시 입력해주세요";
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		//1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다.
		//2. 사용자에게 이용할 사물함 번호를 묻는다.
		//3. 비밀번호를 입력받아 확인한다.
		//4. 일치여부 출력한다.
		Scanner sc = new Scanner(System.in);
		Ex01Main ex01main = new Ex01Main();
		System.out.println(ex01main);
		
		
		String resut = "";
		String choiceMsg = "이용할 사물함 번호 : ";
		String inputMsg = "비밀번호 입력 : ";
		int choice = 0, inputPw = 0;
		
		int[] arPw = ex01main.setLockerPw(5, sc);
		
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		//일치, 불일치
		System.out.println(ex01main.checkLockerPw(arPw[choice - 1], inputPw));
		
	}
}