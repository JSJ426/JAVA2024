/*
 * 작성일: 5월 14일 작성자: 202295037 장석진
 */


//메인 메소드 밖에서 선언하고있음(생성자 제외 클래스가 가질 수 있는 모든 것을 가지고 있음)
public class C_Main2 {
	int count = 10;
	static int num = 20;
	
	//메소드 선언
	public int sum(int x, int y) {
		return x + y;
	}
	
	//클래스 메소드 선언
	static int mul(int x, int y) {
		return x * y;
	}

	//메인 메소드(클래스 메소드)
	public static void main(String[] args) {
		//객체 생성
		C_Main2 cm = new C_Main2();
		
		int same; //메인 메소드에서 선언한 지역변수
		
		//클래스 변수가 아니지만, 객체를 통하여 접근이 가능하다
		same = cm.count;
		System.out.println("count = " + same);
		
		//num은 클래스 변수 => 클래스 명으로 접근
		//same = num;
		//smae = cm.num; 둘다 가능하지만
		same = C_Main2.num; //클래스 명을 사용하는게 가장 올바른 방법입니다
		System.out.println("num = " + same);
		
		//객체를 통해 메소드 호출
		same = cm.sum(5, 5);
		System.out.println("sum = " + same);
		
		same = mul(5, 5);
		System.out.println("mul = " + same);

	}

}
