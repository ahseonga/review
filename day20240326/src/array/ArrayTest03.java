package array;

public class ArrayTest03 {
	public static void main(String[] args) {
		//2. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 배열에 담고 출력하기
		//단, 칸수를 이용해서 배열 생성
		
		
		//1) 배열3칸 생성
		//2) 반복문 for {
		//3) 	나머지 연산자를 이용(5개마다 값이 반복됨) }
		
		
		int[] ar = new int[10];
		for (int i = 0; i<ar.length; i++) {
			ar[i] = i % 5;
		} 
		
		for (int i = 0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		
		
	}
}
