/*
 * 작성일: 5월 10일 작성자: 202295037 장석진
 */

class Box4{
	int width, height, depth;
  
  //생성자
  public Box4(){
	  //여기서 this는 다른 생성자를 호출하는 역할을 합니다(밑의 Box4를 호출하여 "매개변수 3개 생성자 수행"이 가장만저 프린트 되고 각 변수에 값이 저장됩니다)
	  //this를 이렇게 활용할 때는 반드시 첫 번째 줄에 와야합니다
	  //밑의 Box4를 수행하고 다시 돌아와 "매개변수 없는 생성자 수행"이 프린트 되고 main 메소드로 넘어갑니다
	  this(1, 1, 1);
	  System.out.println("매개변수 없는 생성자 수행");
  }
  
  //생성자 오버로딩
  public Box4(int width, int height, int depth) {
	  System.out.println("매개변수 3개 생성자 수행");
	  this.width = width;
	  this.height = height;
	  this.depth = depth;
  }
  
  
}
public class thisTest04 {

	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수 없음): " + vol);
		
		mybox1 = new Box4(10, 20, 30);
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수 3개): " + vol);

	}

}

//번외 -메소드와 생성자는 기능이고, 생성자는 클래스와 이름이 같고 메소드는 이름이 다릅니다(메소드도 오버로딩하여 사용가능합니다)
