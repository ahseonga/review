package Day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);

	System.out.println("첫번째 정수 입력 :  ");
	int num1 = sc.nextInt();
	System.out.println("두번째 정수 입력 :  ");
	int num2 = sc.nextInt();
	
	int max = (num1 > num2) ? num1 : num2; //
	
	System.out.println("입력된 두 수 중에서 더 큰수는 : " + max);
	}
}
