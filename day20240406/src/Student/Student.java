package Student;

public class Student {
	//학생 클래스
	
	//필드 
	//이름, 전공, 나이, 학년, 학점
	
	String name;
	String major;
	int age;
	int grade;
	char score;
	
	
	
	//생성자
	//기본 생성자
	public Student() {
	}
	//이름, 전공, 나이 입력받는 생성자
	public Student(String name, String major, int age) {
		this.name = name;
		this.major = major;
		this.age = age;
	}
	//이름, 전공, 나이, 학년을 입력받는 생성자
	public Student(String name, String major, int age, int grade) {
		this.name = name;
		this.major = major;
		this.age = age;
		this.grade = grade;
	}

	//메소드 
	//학생의 이름과 학년, 전공을 출력하는 메소드 printStudent
	
	void printStudent() {
		System.out.println(this.name + "\t" + this.grade + "\t" + this.major);
	}
	
	//학생의 전공 과목의 성적을 2개 입력 받아, 전공 과목의 평균을 반환하는 메소드
	//avgScore 	매개변수 2 o, 리턴값 o
	double avgScoer(int subject1, int subject2) {
		//실수형 변수 = (double) (매개변수1 + 매개변수2) / 2;
		//과목 성적을 더하고 /2을 반환??
		double avg = (double)(subject1 + subject2) / 2;
		return avg;
	
	}
	
	//학생의 평균이 90점 이상이라면 A, 70점 이상이라면 B, 60점 이상이라면 C, 그외는 F학점으로 반환하는 메소드
	//gradeScore
	
	
	
}
