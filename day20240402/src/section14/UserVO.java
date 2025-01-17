package section14;

public class UserVO {
	//필드 생성	
	private String ID;
	private String PW;
	private String name;
	private int age;
	
	
	//생성자 생성
	public UserVO(String iD, String pW, String name, int age) {
		this.ID = ID;
		this.PW = PW;
		this.name = name;
		this.age = age;
	}
	
	//to String()을 재정의하여 모든 필드의 값을 확인하기
	@Override
	public String toString() {
		return "회원정보 [아이디 : " + ID + "비밀번호 : " + PW + "이름 : " + name + "나이 : " + age + " ] ";
	}

	//모든 필드의 getter 메소드를 만들어보자
	
	public String getID() {
		return ID;
	}
	
	public String getPW() {
		return PW;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
}