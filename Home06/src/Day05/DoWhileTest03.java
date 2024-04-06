package Day05;

import java.util.Scanner;

public class DoWhileTest03 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int choice;
	
	do { 
		System.out.println("메뉴를 선택하세요 : ");
		System.out.println("1. 항목 : 1");
		System.out.println("2. 항목 : 2");
		System.out.println("3. 종료");
		System.out.println("4. 선택 : ");
		
		Scanner scanner;
		while (!scanner.hasNextInt()) {
            System.out.println("숫자를 입력하세요.");
            System.out.print("선택: ");
            sc.next(); // 입력을 기다립니다.
        }
        choice = sc.nextInt();
		
	
		
		
	
		
	}


