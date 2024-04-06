package section05;

public class EX05_07 {
	public static void main(String[] args) {
		//로직 구성 <1에서 100 사이의 짝수 구하기>
		//정수형 int 총합 초기값
		//1부터 100까지의 for 반복문 사용
		//조건문 if 사용, 2로 나눌경우 나머지가 0이 아닐 경우 종료하고 , 다음 반복 실행
		// 2로 나누고 나머지가 0인 경우만 출력 (짝수)
		
		
	
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			
			if (i%2 != 0) {
				continue;
			}
			
			sum += i;
		}
		System.out.println("짝수의 합 : " + sum);
		
		
	}
}
