package array;

public class ArrayTest04 {
	public static void main(String[] args) {
//A~F까지 중 C만 제외하고 배열에 담고 출력하기
//1) 문자형 배열 생성 5칸
//2) 임시 변수 정수형
//3) 반복문(for문) {
//4) 임시변수 = i
//5) if (i>1) {
//6) 	임시변수++; }
//7) 배열에 값대입 => 배열[i]	 => (char) (temp+65)		인덱스값 <-- 0,1,3,4,5
		
		char[] al= new char[5];
		int temp = 0;
		for (int i = 0; i<al.length; i++) {
			temp = i;
			if(temp > 1) {
				temp++;
			}
			al[i] = (char)(temp+65);		
		}
		for (int i = 0; i<al.length; i++) {
			System.out.println(al[i]);
		}
	
		
		
		
	}
}
