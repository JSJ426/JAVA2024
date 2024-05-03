/*
 * 작성일 : 5월 3일
 * 작성자 : 장석진
 * 설명 : 클래스 모음
 */

//main 메소드가 있는 클래스에만 public 붙인다.
//다른 클래스에서는 public 붙이지 않는다.
class PlusMinus{
   int plus, minus; //변수 plus 
	
	//기능(메소드) 정의
	//plus 기능
	//2개의 정수형 값을 전달 받아 합계를 구한 값을 돌려준다.
	public String plus(int x, int y) { //메소드 plus 이 메소드의 기능은 두 수의 합을 계산하여 스트링으로 반환하는것, public 접근가능, 오픈, 공개, 열려있다
		plus = x + y;
		return "두 수의 합은 " + plus; //다 계산해서 값을 돌려주는 기능
	}
	
	//minus 기능
	public String minus(int x, int y) {
		minus = x - y;
		return "두 수의 차는 " + minus;
	}
}

//곱하기 나누기 클래스
//더하기, 빼기, 나누기, 곱하기 기능을 다 가지고 있다.
class MultiDiv extends PlusMinus{//extends는 상속 받겠다는 뜻.
	int multi;
	double div;
	
	//multi 기능(메소드) 정의
	public String multi(int x, int y) {
	    multi = x * y;
	    return "두 수의 곱은 " + multi;
	}
	
	//div 기능(메소드) 정의
	public String div(int x, int y) { //private를 public 대신 쓰면 접근 금지 명령이 된다
		div = x / y;
		return "두 수의 나눔은 " + div;
	}
	
}

public class Calculator {

	public static void main(String[] args) {
		//PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus(); //pm은 플라스마이나스 줄인거, pm객체는 클래스로 가기 위한 통로이다.
		//MultiDiv 클래스로부터 객체 생성.
		MultiDiv md = new MultiDiv(); // +, -, * ,/ 다 갖고 있다 extends로 상속 받았기 때문.
		
		//변수 선언
		String sum, cha, multi, div;
		
		//pm 객체를 통해 PlusMinus 클래스에 있는 메소드를 호출
		sum = pm.plus(10, 20); //plus 메소드에게 역할 전달
		System.out.println(sum);
		
		//pm 객체를 통해 minus 메소드 호출
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		//md 객체를 통해 MultiDiv 클래스에 있는 메소드 호출
		multi = md.multi(10, 20);
		System.out.println(multi);
		
		//md 객체를 통해 더하기 결과 출력
		//상속받아 사용하기에 plus 메소드 접근 가능
		//메시지가 요구하는 메소드가 자신의 클래스에 없으면 상위 클래서에서 메소드르 찾는다
		sum = md.plus(10, 20);
		System.out.println(sum);
		
		//md 객체를 통해 나누기 결과 출력
		div = md.div(10, 20);
		System.out.println(div);
		

	}

}
