/*
 * 작성일: 5월 24일 장석진 202295037
 */
class OT3a{
	//매개변수가 1개인 메소드 생성
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show() 수행: " + str);
	}
}

class OT3b extends OT3a{
	@Override
	//public void sho(String str) 만약 메소드 이름이 다르면 @Override가 오류라고 말해줌
	public void show(String str) {
		System.out.println("하위 클래스 메소드 show() 수행: " + str);
	}
}

class OT3c extends OT3b{

	@Override
	public void show(String str) {
		super.show(str);//super는 상위 클래스의 메소드로 접근할 때 사용한다, 위에거 만들어놓고 쓰지도 않을 때 필요 써야지
	}	
}


public class OverridingTest3 {

	public static void main(String[] args) {
		OT3b otb = new OT3b();
		otb.show("오늘은 금요일");

	}

}
