package Day05;

import java.util.Scanner;

public class ForTest05 {
	public static void main(String[] args) {
		//3단 구구단 3x1 =3
		//....
		//3x9 = 27
		
		
		int dan = 3, num = 1;
		//사용자가 입력한 숫자의 단이 출력이 되도록 하기
		//입력클래스 import
		//dan 변수 nextInt()
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고 싶은 단을 입력하세요 : ");
		dan = sc.nextInt();
		for(int i = 1; i<10; i++) {
			System.out.printf("%d x %d = %d", dan, i, dan*i);
			System.out.println();
		}
			
	}
}
