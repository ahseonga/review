package tvTask;

import java.util.Scanner;

public class Tv {
	public static void main(String[] args) {
		String msg = "1. 전원 버튼\n"
					+ "2. 채널 올리기\n"
					+ "3. 채널 내리기\n"
					+ "0. 프로그램 종료\n"
					+ "4. 번호 입력 : ";
		
		
		//While문을 통해서 프로그램을 무한반복한다.
		//사용자에게 옵션메뉴를 출력하고 번호를 입력받는다.
		//선택한 옵션에 따라 수행한다.
		//1번 선택 시 : Tv전원을 on, off한다  => 켜졌을 경우 Tv전원이 켜졌습니다 출력
		// 				꺼져있을 경우 Tv전원이 꺼졌습니다 출력
		//2번 선택 시 : Tv전원이 켜져있을 경우 현재 채널을 출력하고 올린 채널 출력
		// 				꺼져있을 경우 Tv전원을 먼저 켜주세요 메시지 출력
		//3번 선택 시 : Tv전원이 켜져있을 경우 현재 채널을 출력하고 올린 채널 출력
				// 		꺼져있을 경우 Tv전원을 먼저 켜주세요 메시지 출력
		//0번 선택 시 : 프로그램 종료한다.
		//그외 선택 시 : 다시 번호를 입력하세요.
		
		//입력클래스
		//While(true) {
		//msg 출력
		//입력 메소드
		//switch ~ case 1: 2: 3: 0: default:
		//1. 메소드 호출
		//2. if ~ else
		//3. if ~ else
		//0. syso() break
		//default : syso() } }
		
		BasicTv basicTv = new BasicTv("black", 16, 100000);
	
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(msg);
			int choice = sc.nextInt();
			switch (choice) {
			case 1 : 
				basicTv.powerOnOff();
				break;
			case 2 : 
				if(basicTv.power) {
					System.out.println("현재 채널 : " + basicTv.channel);
					System.out.println("채널이 변경되었습니다. 현재 채널 : " + basicTv.channelUp());
				}else {
					System.out.println("Tv 전원을 켜주세요");
				}
				break;
			case 3: 
				if(basicTv.power) {
					System.out.println("현재 채널 : " + basicTv.channel);
					System.out.println("채널이 변경되었습니다. 현재 채널 : " + basicTv.channelDown());
				}
				else {
					System.out.println("Tv 전원을 켜주세요");
					}
				break;
			case 0 : 
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
				break;
			default : 
				System.out.println("다시 입력하세요");
				break;
		} //swtich문 영역 종료
						
		} // while문 영역 종료		
	}

}
