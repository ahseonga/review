package section05;

public class EX05_04 {
	public static void main(String[] args) {
		//로직 구성
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <7 - i; j++) {
				System.out.println(" ");
			}
			
			for (int k = 0; k < (2*i) + 1; k++) {
				System.out.println("*");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
	}
}