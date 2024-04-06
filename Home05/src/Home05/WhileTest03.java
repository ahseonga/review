package Home05;

import java.util.Scanner;

public class WhileTest03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while (num <=0) {
			System.out.println("숫자 입력 : ");
			num = sc.nextInt();
			if(num <=0) {
				System.out.println("양수가 아닙니다.");
			}
		} System.out.println(num + "양수입니다.");
	}
}
