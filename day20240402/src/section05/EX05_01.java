package section05;

public class EX05_01 {
	public static void main(String[] args) {
		int sum = 0; //1부터 10까지의 합 출력할 변수 sum에 초기값 0 대입
		
		for (int i = 1; i<= 10; i++) { //조건문 for문을 이용해 변수 반복되는 값 누적
			sum += i;
		}
		System.out.println(" 합 : " + sum); // 변수 값 출력
		
	}
}
