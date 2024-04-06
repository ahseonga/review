package Home05;

public class WhileTest02 {
	public static void main(String[] args) {
//1부터 100까지의 짝수의 합 출력(While문)
	
		int cnt = 1, even = 0;
		while (cnt <=100) {
			if (cnt % 2 == 0) {
				even += cnt;
			}
			cnt++;
		}
		System.out.println(even);
		
		}
	}

