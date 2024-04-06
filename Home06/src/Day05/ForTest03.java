package Day05;

public class ForTest03 {
	public static void main(String[] args) {
		//1부터 100 짝수만 출력 tab키 적용
		//1) for (초기식 : int i = 0;
		// 조건식 : i<=100; or i <=50;
		// 증감식 : i++ or i+=2
		// 조건문   if (1 % 2 == 0 && i ! = 0)       (if i ! = 0)
		// 조건문   출력문(print(i + "\t")
		// 					A~F 출력
		//aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		
		for (int i = 0; i <=100; i+=2) {
			if(i !=0) {
				System.out.println(i);
			}
		}
		
		
		
		
	
		}
	}

