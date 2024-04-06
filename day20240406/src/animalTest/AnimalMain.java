package animalTest;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal animal = new Animal("행복이" , 5, "강아지");
//		
//		
//		animal.cry();
//		animal.eat();
		
		//객체 2개, 생성하고 메소드 호출
		Animal cat = new Animal();
		cat.printAnimal();
		
		Animal dog = new Animal("멍멍이", 2, "골든리트리버");
		dog.eat("개껌");
		
		
		
		
		
	}
	
	
}
