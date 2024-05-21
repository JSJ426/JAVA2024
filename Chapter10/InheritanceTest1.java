/*
 * 작성일 : 5월 21일 
 * 작성자 : 장석진 202295037
 * 
 * 설명 : 상속과 한정자
 */

class A{
	public int aa = 1; // 멤버변수이면서 모두 접근 가능
}
// A클래스를 상속
class B extends A{
	private int bb = 2; // 멤버변수(B클래스에서만 접근이 가능함)
	public int bb() { // 이 메소드는 모두 접근이 가능
		return bb; // 멤버변수는 private이지만 메소드를 통해 접근가능하게 하였음
	
	// 이 클래스에는 aa, bb, bb()가 있다
	}
}

class C extends B{
	// 이 클래스에는 aa, bb, cc, bb()가 있다
	int cc = 3;  // 한정자가 없음으로 같은 패키지 내에서 접근가능
}
public class InheritanceTest1 {

	public static void main(String[] args) {
		C objC = new C();  // C클래스 객체 생성
		System.out.println("cc의 값은 " + objC.cc); // 3이 출력된다
		//System.out.println("cc의 값은 " + objC.bb); // 오류가 난다 private이기 때문에
		System.out.println("cc의 값은 " + objC.bb()); // 메소드로 접근하여 bb값을 출력할 수 있다!!
		System.out.println("cc의 값은 " + objC.aa); // 1이 출력된다	

	}

}
