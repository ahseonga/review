package section05;

import java.util.Random;

public class EX05_10 {
    public static void main(String[] args) {
        Random random = new Random(); //random 입력클래스 불러오기
        int dice1, dice2; 	//정수형 값 dice1, dice2 
        int count = 0; //정수형 반복 횟수 count 초기값 

        do { //두개의 주사위가 같은값이 나올때까지 반복문을 돌려야하니 do ~ while 구문 사용
            dice1 = random.nextInt(6) + 1; //인덱스0부터 시작이므로, +1 
            dice2 = random.nextInt(6) + 1; //인덱스0부터 시작이므로, +1
            

  
            System.out.println("반복 횟수: " + count);
            count++; //반복 횟수 증가
            System.out.println("주사위 1: " + dice1);
            System.out.println("주사위 2: " + dice2);
        } while (dice1 != dice2); 

        System.out.println("두 개의 주사위가 같은 값을 가질 때까지 반복하였습니다.");
        
        int[][] arr = new int [][4];
    }
}