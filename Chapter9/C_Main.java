/*
 * 작성일: 5월 14일 작성자: 202295037 장석진
 */


//메인 메소드 밖에서 선언하고있음(생성자 제외 클래스가 가질 수 있는 모든 것을 가지고 있음)
public class C_Main {
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
		int same; //메인 메소드에서 선언한 지역변수
		
		//반드시 클래스 변수, 지역 변수만 사용 가능합니다
		//same = count; //클래스 메소드에서 count가 일반객체로 선언되어 있기 때문에 오류 발생 
		
		same = num;
		System.out.println("num = " + same);
		
		//클래스 메소드가 아니어서 오류가 발생
		//호출 불가능
		//same = sum(5, 5);
		
		same = mul(5, 5);
		System.out.println("mul = " + same);

	}

}
