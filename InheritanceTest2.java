/*
 * 작성일 : 5월 21일 
 * 작성자 : 장석진 202295037
 * 
 * 설명 : 상속과 우선순위
 */
class B1{
	public int x = 500;
	public int y = 1000;
}
class B2 extends B1{
	public String x = "오늘은 화요일 입니다";
	//이 클래스에는 x, y, x가 있다(x가 겹친다?!), B2의 x가 우선이다 - 설명은 코드 제일 밑에 설명있음
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		B1 b1 = new B1(); // 객체 생성
		B2 b2 = new B2();
		System.out.println("객체 b1의 들어있는 x, y값 " + b1.x + ", " + b1.y);
		System.out.println("객체 b2의 들어있는 x, y값 " + b2.x + ", " + b2.y); // B2클래스의 x가 출력된다!

	}

}
/*
 * 같은 이름으로 선언된 멤버 변수의 경우
 * 상위 클래스의 멤버 변수는 가려진다
 * 하위 클래스의 멤버 변수가 우선이다
 */
