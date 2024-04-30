/*
 * 작성일 : 4월 30일
 * 작성자 : 장석진
 * 설명 : 메인 메소드가 있는 클래스.
 *      클래스로부터 객체 생성하여 계산 결과 출력한다.
 */
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
		System.out.println(Double.toString(div));
		

	}

}
