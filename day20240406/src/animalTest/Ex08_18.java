package animalTest;

public class Ex08_18 {
	void take(int m) {
		while (true) {
			if (m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return; //while 문을 빠져나갈 때 break를 사용했던 것처럼, 메서드를 빠져나가기 위해 return을 사용
			}
			System.out.println("버스를 탑니다");
			m -= 1250;	
		}
	}
}
