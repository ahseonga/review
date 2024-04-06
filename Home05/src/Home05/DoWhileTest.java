package Home05;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int num = 0;
		 do {
			 System.out.println("숫자 입력 : ");
			 num = sc.nextInt();
			 
			 if (num <= 0) {
				 System.out.println("양수가 아닙니다. 다시 입력하세요");
			 }
		 }while(num <=0);
		 
		 System.out.println(num + "는 양수입니다. ");
	   }
	}
