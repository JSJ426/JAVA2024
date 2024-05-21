/*
 * 작성일 : 5월 21일 
 * 작성자 : 장석진 202295037
 * 
 * 설명 : 클래스 변수와 클래스 메소드의 상속
 */

class C1{
	private static int x = 100; // 클래스 변수들
	public static int y = x;
	static int z = x;
	
	public static int cc() { // 클래스 메소드
		return x;
	}
}

class C2 extends C1{
	public static String x;
	static int y;
	//이 클래스는 x, y, z, cc()가 있다.
	//이때 x와 y는 C2클래스에 있는 클래스 변수이다.
	}

public class InheritanceTest3 {

	public static void main(String[] args) {
		//객체 생성 할까요? no static이 있어서 생성할 필요 없다
		//클래스 변수와 클래스 메소드는 클래스 이름으로 접근가능하다
		System.out.println("cc()값 : " + C1.cc());
		System.out.println("C1 클래스의 y 메소드 값 : " + C1.y);
		System.out.println("C1 클래스의 z 메소드 값 : " + C1.z);

		System.out.println("C2 클래스의 x 메소드 값 : " + C2.x);
		System.out.println("C2 클래스의 y 메소드 값 : " + C2.y);
		System.out.println("C2 클래스의 z 메소드 값 : " + C2.z);
		
		C2.x = "오늘은 화요일 입니다.";
		C1.y = 150;
		C2.y = 200;
		C2.z = 300; // == (C1.z = 300;)
		
		System.out.println("C2 클래스의 x 메소드 값 : " + C2.x);
		System.out.println("C1 클래스의 y 메소드 값 : " + C1.y);
		System.out.println("C2 클래스의 y 메소드 값 : " + C2.y);
		System.out.println("C2 클래스의 z 메소드 값 : " + C2.z);
		
	}

}
