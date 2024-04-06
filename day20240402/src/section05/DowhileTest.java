package section05;

import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	  int number;

      do {
          System.out.print("숫자를 입력하세요: ");
          number = sc.nextInt();

          if (number > 0) {
              System.out.println("양수입니다.");
          } else if (number == 0) {
              System.out.println("0입니다.");
          } else {
              System.out.println("음수입니다.");
          }
      } 	

      System.out.println("프로그램을 종료합니다.");
      sc.close();
	
	
	}
}
