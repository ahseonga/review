package animalTest;

public class Animal {
	//동물 클래스
	//필드
	// 이름 , 나이, 종(species)
	
	String name;
	int age;
	String species;
	
	//생성자
	//기본 생성자 : 이름과 종을 받는 생성자, 이름과 나이와 종을 받는 생성자
	// this() : 자기자신의 생성자
	
	
	public Animal() {
		this("고양이", 2, "");
	}
	
	public Animal(String name, String species) {
		this(); //기본 생성자
		this.name = name;
		this.species = species;
	}


	public Animal(String name, int age, String species) {
	
		this.species = species;
	}
	
	
	
//	
//	//메소드
//	
//	void eat () {
//		System.out.println(this.name + "의 " + this.species + "은/는 먹이를 먹을 수 있다.");
//	}
//	
//	void cry () {
//		System.out.println(this.name + "의 " + this.species + "은 울음소리를 낼 수 있다.");
//	}
//	
//	//먹을 수 있다.
//	//울음소리를 낼 수 있다.
//	//달릴 수 있다.
//	//날 수 있다.
	
	//메소드 
// printAnimal (매개변수 x, 리턴값 x)
	//정보 출력 메소드 : 이름, 나이 , 종을 출력
	
	void printAnimal () {
		System.out.println(this.name + "나이는 " + this.age + "살이고, 종은 " + this.species + "입니다" );
	}
	
	
// eat (매개변수 o, 리턴값 o -> 종과 먹이)
// 동물 이름이 먹이를 먹습니다 출력
	
	String eat (String food) { //매개변수 String food, 리턴값 o
		System.out.println(this.name + "이/가" + food + "를/을 먹습니다");
		return food;
	}

	
// sleep (매개변수 x, 리턴값 o -> 종)
	
	String sleep() {
		System.out.println(this.name +"잠을 잡니다");
		return species;
	} 
	
	
	
	

}
