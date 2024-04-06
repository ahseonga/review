package Day05;

public class ForTest06 {
	public static void main(String[] args) {
		
	
//구구단 2단 ~ 9단까지 탭키 적용해서 단마다 가로로 출력하기 
//      첫 번째 외부 반복에서는 num이 1이므로, 안쪽 반복문은 2부터 9까지 실행됩니다. 이때 dan은 2부터 9까지 변화하면서 "2X1=2", "3X1=3", ..., "9X1=9"까지의 구구단을 출력합니다.
//		두 번째 외부 반복에서는 num이 2이므로, 안쪽 반복문은 다시 2부터 9까지 실행되며 "2X2=4", "3X2=6", ..., "9X2=18"까지의 구구단을 출력합니다.
//		이러한 방식으로 num이 1씩 증가하면서 1부터 9까지의 구구단이 모두 출력됩니다.
// 이제 이해가 가는부분...ㅠ 어렵다....		
		
for (int num = 1; num <9; num++) {
	for(int dan = 2; dan <=9; dan++) {
		System.out.print(dan + "X" + num + "=" + dan * num + "\t");
	}
	System.out.println();
}
}
}
