package section05;

public class EX05_03 {
	public static void main(String[] args) {
		//로직구성
		//이중 for문 사용
		//1) 바깥쪽 for문은 행을 의미 -> 2부터 9까지 
		//2) 안쪽 for문은 열을 의미 -> 1부터 9까지
		//3) 내부 for문 안으로 print를 이용해 줄바꿈 없이 출력
		//4) 안쪽 for문 9부터 줄바꿈이 되어야하니.. 안쪽 for문 종료 후, syso.println() 사용해서 출력
		
		
		for (int i = 2; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
			System.out.print(i + " X " + j + " = " + (i*j) + "\t");	 
			}
			System.out.println();
		}

	}
}
