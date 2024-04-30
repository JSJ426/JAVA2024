/*
 * 작성일 : 4월 30일
 * 작성자 : 장석진
 * 설명 : MutiDiv 클래스 생성.
 *      곱하기, 나누기 계산하는 기능이 있다.
 *      그리고 더하기, 빼기 계산하는 기능 '도' 있다!
 */

                      //PlusMinus로부터 상속 받는다
public class MultiDiv extends PlusMinus {
	//속성 정의
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
