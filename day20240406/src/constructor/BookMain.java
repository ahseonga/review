package constructor;

public class BookMain {
	public static void main(String[] args) {
		//객체 
		Book b1 = new Book(); //기본생성자를 만들어놓았으니 가능하다!
		
		b1.title = "자바의 신";
		b1.author = "자바 ";
		b1.printBook();
		b1.price = 20000;
		
		Book b2 = new Book("자바프로그래밍", "개발자", 0, 2024);
		b2.printBook();
		b2.price = 30000;
		
		BookMain bm = new BookMain();
		System.out.println(bm);
		
		
		//객체마다의 배열
		int[] prices = {b1.price, b2.price};
		System.out.println(bm.totalPrice(prices));
		

//				
//		System.out.println(bm.totalprice());
//					
	}
	
	//객체마다의 가격의 총합을 구하는 메소드
	
	int totalPrice(int[] prices) {
		//총합 저장할 변수선언
		//반복문(for each문) {
		//총합 변수 += for each문 변수
		//}
		//return 총합변수
		
		int total = 0;
		for(int price: prices) {
			total += price;
		}
		return total;
		
		
		
		
	}
	
	//객체마다의 가격의 총합을 구하는 메소드
	int totalPrice2(Book...books) {
		//총 가격을 구할 변수 선언
		int total = 0;
		//반복문(for each문)
		for(Book book : books) {
			total += book.price;
		}
		return total;
	}
	
	
	
	
}
