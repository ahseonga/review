package tvTest;

public class Tvmain2 {
	public static void main(String[] args) {
		Tv2 sTv = new Tv2(10, 10, true, "black");
		System.out.println(sTv.ch);
		System.out.println(sTv.power);
		System.out.println(sTv.vol);
		System.out.println(sTv.color);
		
		sTv.ch = 20;
		System.out.println(sTv.ch);
		
	}
}
