package typeCasting;

public class Test01 {
	public static void main(String[] args) {
		//1. 올해 년도, 월, 일을 정수형타입의 변수로 만들고
	    //올해는 0000년, 0월, 0일 입니다 형태로 출력하기
		
		//2. 올해 년도를 문자열로 만든 변수 year2를 선언하고
	    //24라는 값만 출력하기
		
		int year = 2024;
		int month = 3;
		int date = 12;
		
		System.out.println("올해는 " + year + "년, " + month + "월, " + date + "일 입니다. ");
		
		
		String year2 = year + "";
		System.out.println(year);
		char ch1 = year2.charAt(2);
		char ch2 = year2.charAt(3);
		System.out.print(ch1);
		System.out.println(ch2);
		System.out.printf("%c%c", year2.charAt(2), year2.charAt(3));
		
		
		

		
		
		
		
	}
}
