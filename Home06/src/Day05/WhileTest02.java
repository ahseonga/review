package Day05;

public class WhileTest02 {
	public static void main(String[] args) {
		//1부터 100까지의 짝수의 합 출력(While문)
		
		//로직구성
		// 1) 변수 선언(카운트, 총합)
		// 2) 반복문(while (){
		// 3) 조건문(if (카운트 % 2 ==0)){
		// 4) cnt % 2 == 0는 cnt를 2로 나눈 나머지가 0인지를 확인한다.
		// 5) cnt % 2 == 0 cnt를 2로 나눈 나머지가 0인지를 확인한다. (cnt를 2로 나눈 나머지가 0인지를 확인한다. %%<-- 까먹지 말기
		// 6) 총합 구할 변수 += 카운트}
		// 7) 카운트 변수 증가
		// 8) 출력
		
		int cnt = 1, even = 0;
		while (cnt <= 100) {
//			System.out.println(cnt);
		if (cnt % 2 == 0) {
			even += cnt;
		}
		cnt++;
		}
		System.out.println(even);
		
		
		
		
		
		
		
		
	} 
}
