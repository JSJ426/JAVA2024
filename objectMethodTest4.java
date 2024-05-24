/*
 * 작성일: 5월 24일 장석진 202295037
 */
class Box11{
	public int width;
	public int height;
	public int depth;
	public Box11(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class objectMethodTest4 {

	public static void main(String[] args) {
		Box11 b1 = new Box11(10, 20, 30);
		Box11 b2 = new Box11(10, 20, 30);
		Box11 b3 = b2;
		  System.out.println(b1.equals(b2) ? "b1과 b2는 같다" : "b1과 b2는 같지 않다");
		  System.out.println(b2.equals(b3) ? "b2과 b3는 같다" : "b2과 b3는 같지 않다");
		  
		String s1 = new String("처음 시작하는 자바");
		String s2 = new String("처음 시작하는 자바");
		  System.out.println(s1.equals(s2) ? "s1과 s2는 같다" : "s1과 s2는 같지 않다");
		  //String이란 메소드가 없다(object의 String을 가져옴, 그래서 매개변수를 비교하게 되고 같다라고 출력됨)
		  //객체가 가진 문자열을 비교한다
		  System.out.println(s1 == s2 ? "s1과 s2는 같다" : "s1과 s2는 같지 않다");

	}

}
