package array;

import java.util.Scanner;

public class ArrayTest05 {
	public static void main(String[] args) {
//5칸 정수배열을 만들고 입력받아 최대값 최소값 출력하기
//1) 정수형 배열 5칸
//2) 입력클래스 import
//3) 변수 String msg, max, min
//4) 반복문(for문) - 입력받기 위한 반복문
//5) min = 배열[0], max = 배열[0]
//6) 반복문(for문) - 조건문(if문 최소값, if문 최대값)
//7) 		
		int[] ar = new int[5]; //인덱스값은 0,1,2,3,4
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 입력 : ";
	
		for(int i = 0; i<ar.length; i++) {
			System.out.print(i +1 + msg);
			ar[i] = sc.nextInt();
		} 
		int min = ar[0], max = ar[0];
		for(int i = 0; i <ar.length; i++) {
			if(min > ar[i]) {
				min = ar[i];
			}
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
		
		
	}
}
