package Day05;

public class TwoForTest01 {
	public static void main(String[] args) {
		//2단~9단 구구단 출력하기, tab키 적용해서 가로로 나올 수 있도록 출력하기 
		
		
		for(int dan = 2; dan < 10; dan++) {
//			System.out.println(dan);
			for(int num = 1; num <10; num++) {
//				System.out.println("dan : " + dan + "num : " + num);
//				System.out.println(dan);
				System.out.println(dan + "x" + num + "=" + dan*num);
				
			}	System.out.println();
			
		}
		
		}
	}

