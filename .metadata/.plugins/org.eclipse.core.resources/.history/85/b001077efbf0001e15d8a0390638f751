package section05;

import java.util.Random;

public class CardGame {
    public static void main(String[] args) {
        int[] cards = new int[10]; // 카드를 저장할 배열

        // 카드 배열에 숫자 1부터 10까지 초기화
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i + 1;
        }

        // 카드를 섞기 위해 랜덤 함수 사용
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            // 배열의 i번째 카드와 랜덤하게 선택된 다른 위치의 카드를 교환
            int randomIndex = random.nextInt(cards.length);
            int temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }

        // 결과 출력
        System.out.println("철수가 게임에 사용한 카드:");
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
    }
}