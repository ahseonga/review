package Day05;

public class ForTest02 {
	public static void main(String[] args) {
		//1번 송아성
		//2번 송아성
		//3번 송아성
		//4번 송아성
		//5번 송아성
		//for문 이용해서 출력하기
		//System.out.Printin("번 송아성")
		
		//로직구성
		for (int i = 1; i<=5; i++) {
			String name = "송아성";
			System.out.println("\"" + i + "번 " + name + "\"");
		}
		
		//10번째 송아성 ~ 1번째 송아성
		for (int i = 0; i<10; i++) {
			String name = "송아성";
			System.out.println(10-i + "번 " + name);
					
		}
		
		
	}
}
