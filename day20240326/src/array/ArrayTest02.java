package array;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		//3명의 학생 java 점수를 입력받아 배열에 저장하고
		//평균 점수 출력하기
		
		//로직 구성
		//1) 변수, 배열(int 총합 1개, String 번 학생 점수), int 배열3칸
		//
		
		Scanner sc = new Scanner(System.in);
		
		int total =0;
		int[] score = new int[3];
		String msg = "번 학생의 java 점수 : ";
		for(int i = 0; i<score.length; i++) {
			System.out.println(i + 1 + msg);
			score[i] = sc.nextInt();
		}
		for(int i = 0; i<score.length; i++) {
			total += score[i];
	}
	System.out.println((double)(total/score.length));
	//평균점수 => 실수 
	
		
	}
	}

