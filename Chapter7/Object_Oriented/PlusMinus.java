/*
 * 작성일 : 4월 30일
 * 작성자 : 장석진
 * 설명 : PlusMinus 클래스 생성.
 *      더하기, 빼기 계산하는 기능이 있다.
 */
public class PlusMinus {
	//속성 정의
	//변수 생성
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

}//객체는 하나만 있으면 다수의 메소드 사용가능
