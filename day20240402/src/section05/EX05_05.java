package section05;

public class EX05_05 {
	public static void main(String[] args) {
		//while문으로 1부터 10까지의 합 출력하기
		//로직 구성
		//정수형 int 변수 sum 총합 초기값
		//정수형 int 변수 i = 1 값 
		//while 반복문을 사용 (i가 10이 될떄까지 반복문, 10 이상이 나오면 false값으로 종료됨)
		//sum에 값 누적
		//증감연산자 i++
		//출력
		
		int sum = 0; 
		int i = 1;
		
		while (i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("합 : " + sum);
	}

}
