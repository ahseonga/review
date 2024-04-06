package array;

public class TwoArrayTest {
	public static void main(String[] args) {
		int[][] twoAr;
	    twoAr = new int[4][4];
//		
//		System.out.println(twoAr);
//		System.out.println(twoAr[0][0]);
//		
//		twoAr[0][0] = 1;
		
		for(int i = 0; i < 4; i++) {//행을 의미 
			for(int j = 0; j < 4; j++) {
				twoAr[i][j] = i * 4 + j + 1;
				System.out.print(twoAr[i][j] +"\t");
				
			}
			System.out.println();
			
		} 
		
		
	}
}
