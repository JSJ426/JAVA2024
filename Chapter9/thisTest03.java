/*
 * 작성일: 5월 10일 작성자: 202295037 장석진
 */


//thisTest02로 저장했을 때 Box1 클래스도 오류가 납니다. 이유는 하나의 패키지(프로젝트)안에 같은 클래스가 중복되기 때문입니다. => Box2로 수정합니다
class Box3{
	int width, height, depth;  //멤버변수
	
	//생성자 생성
	//매개변수의 의미가 명확해졌습니다
	public Box3(int width, int height, int depth) {
		//this는 현재 객체변수를 의미합니다
		//객체변수 width에 매개변수 width 값을 저장하게 됩니다
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class thisTest03 {

	public static void main(String[] args) {
		Box3 mybox = new Box3(1, 2, 3);
		System.out.println(mybox.width);
  
	}

}
