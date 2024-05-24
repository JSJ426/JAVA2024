/*
 * 작성일: 5월 24일 장석진 202295037
 */
class OT1a{
	//매개변수가 1개인 메소드 생성
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show() 수행: " + str);
	}
}
class OT1b extends OT1a{ //상속됨
	//매개변수가 없는 메소드 생성
	public void show() {
		System.out.println("하위 클래스 메소드 show() 수행: ");	
	}
}
public class OverrridingTest1 {

	public static void main(String[] args) {
		OT1b otb = new OT1b();
		otb.show("처음 시작하는 자바"); //매개변수가 있는 메소드 호출(OT1a)
		otb.show();

	}

}
