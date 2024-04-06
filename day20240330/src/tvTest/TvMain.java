package tvTest;

public class TvMain {
	public static void main(String[] args) {
		//Tv 객체
		Tv samsungTv = new Tv();
		System.out.println(samsungTv);
		
		samsungTv.ch = 10;
		samsungTv.color = "파란색";
		samsungTv.vol = 15;
		
		
		
		System.out.println(samsungTv.ch);
		System.out.println(samsungTv.power);
		
		samsungTv.powerOnOff();
		System.out.println(samsungTv.color);
		samsungTv.chUp();
		//객체에 값을 저장하는 방법이 불편하다.
		
	}
}
