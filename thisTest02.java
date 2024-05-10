
//thisTest02로 저장했을 때 Box1 클래스도 오류가 납니다. 이유는 하나의 패키지(프로젝트)안에 같은 클래스가 중복되기 때문입니다. => Box2로 수정합니다
class Box2{
	int width, height, depth;  //멤버변수
	
	//생성자 생성
	//매개변수의 의미가 명확해졌습니다
	public Box2(int width, int height, int depth) {
		width = width;
		height = height;
		depth = depth;
	}
}
public class thisTest02 {

	public static void main(String[] args) {
		Box2 mybox = new Box2(1, 2, 3);
		System.out.println(mybox.width);

	}

}
