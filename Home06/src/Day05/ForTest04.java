package Day05;

public class ForTest04 {
	public static void main(String[] args) {
//A~F 출력
//		for(char c = 'A'; c<= 'F'; c++) {
//			System.out.println(c);
//		}
//	
//		for(int i = 0; i < 26; i++) {
////			if (i % 2 == 0) {
////				System.out.print((char)(i+97));
////			}else {
//				System.out.print((char)(i+65));
//			}
//			}
		
	for(int i = 0; i < 26; i++) {
		System.out.print((char)(i % 2 ==0 ? i +97 : i + 65));
	}
			
		
	}
}
	

