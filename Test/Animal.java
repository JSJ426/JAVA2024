/*
 * AnimalTest1 클래스를 작성하시오
 * 이 클래스는 다음과 같은 필드를 가집니다
 * protected String name
 * protected int age
 * (상속관계에는 사용가능한 protected)
 * 
 * Animal 클래스는 다음과 같은 메소드를 가집니다
 * 기본 생성자: 이름을 "", 나이를 0으로 초기화합니다
 * 매개변수 생성자: 이름과 나이를 입력받아 초기화합니다
 * 
 * printInfo()메소드 : 동물의 이름과 나이를 출력합니다
 * -----------------------------------------
 * 
 * AnimalTest1 클래스를 상속하는 Dog 클래스를 작성하시오
 * 이 클래스는 다음과 같은 필드를 추가로 가집니다
 * private String breed
 * 
 * Dog 클래스는 다음과 같은 메소드를 가집니다
 * 기본 생성자: 부모 클래스의 기본 생성자를 호출하고, breed를 ""으로 초기화합니다
 * (생성자는 상속이 안되는데 어떻게 호출하는가? super();)
 * 매개변수 생성자: 이름, 나이, 품종을 입력받아 초기화합니다
 * (이름과 나이가 상위 클래스에 있으니 마찬가지 super로 호출합니다)
 * 
 * printInfo()메소드 : 부모 클래스의 printInfo() 메소드를 호출하고, 품종을 추가로 출력합니다
 * (상위 클래스 메소드 호출 super.메소드이름, 상위 클래스에 같은 메소드가 있으니 오버라이딩해서 재정의한다)
 * 
 * -------------------------------------------
 * 
 * Animal 클래스
 * main 메소드 : 강아지 이름과 나이, 품종을 입력받습니다
 * Dog 클래스로부터 객체를 생성하여 결과를 출력하시오
 * 
 * [출력결과]
 * 강아지 이름을 입력하세요: 모카
 * 강아지 나이를 입력하세요: 3
 * 강아지 품종을 입력하세요: 말티즈
 * Name: 모카, Age: 3, 품종: 말티즈
 */
import java.util.Scanner;

class AnimalTest1{
	//멤버변수 - 속성
	protected String name;
	protected int age;
	
	//매개 변수가 없는 생성자 - 이름과 나이 초기화
	public AnimalTest1() {
		this.name = "";
		this.age = 0;
	}
	//매개 변수가 있는 생성자 - 오버로딩 : 이름과 나이를 전달 받아 초기화


public AnimalTest1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printInfo() {
		System.out.print("동물의 이름은: " + name + ", 동물의 나이는: " + age);
	}
}

class Dog extends AnimalTest1{
	//품종 멤버 변수 추가
	private String breed;
	
	//매개 변수가 없는 생성자
	public Dog() {
		super();// 부모 클래스의 기본 생성자를 호출
		this.breed = "";
	}
	//매개 변수가 있는 생성자
	public Dog(String name, int age, String breed) {
		super(name, age);// 상위 클래스의 매개 변수 있는 생성자 호출
		this.breed = breed;
	}
	//source -> override method를 선택하여 오버라이드 생성
	@Override
	//오버라이딩 - 재정의
	public void printInfo() {
		super.printInfo(); // 상위 클래스 메소드 호출
		System.out.println(", 품종은: " + breed);
		
		// System.out.print("동물의 이름은: " + name + ", 동물의 나이는: " + age + ", 품종은: " + breed);
		// 재정의하는 오버라이딩이기 때문에 이렇게 작성해도 되긴 함
	}
	
}
public class Animal {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("강아지 이름을 입력하세요: ");
		String name = stdIn.nextLine();
		System.out.print("강아지 나이을 입력하세요: ");
		int age = stdIn.nextInt();
		stdIn.nextLine();
		System.out.print("강아지 품종을 입력하세요: ");
		String breed = stdIn.nextLine();
		
		//매개 변수 있는 생성자 호출
		Dog dog = new Dog(name, age, breed);
		//출력 메소드 호출
		dog.printInfo();
		
		

	}

}
