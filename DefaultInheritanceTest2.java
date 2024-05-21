/*
 * 작성일 : 5월 21일 
 * 작성자 : 장석진 202295037
 * 
 * 설명 : 상속과 생성자
 */

class DB1{
	public double d1;
	public DB1() { // 묵시적 생성자
		System.out.println("클래스 DB1의 묵시적 생성자 수행");
		d1 = 10 * 10;
	}
}

class DB2 extends DB1{
	public double d2;
	
	public DB2() { // 묵시적 생성자
		System.out.println("클래스 DB2의 묵시적 생성자 수행");
		d2 = 10 * 10 * 10;
	}
	
	public DB2(double d) { // 명시적 생성자
		System.out.println("클래스 DB2의 명시적 생성자 수행");
		d2 = d * d * d;
	}
}

//하위 클래스에는 묵시적, 명시적 생성자가 다 있다
//명시적 생성자를 호출하면, 상위 클래스의 묵시적 생성자가 우선 수행된다
class DB3 extends DB2{
	public double d3;
	
	public DB3() { // 묵시적 생성자
		System.out.println("클래스 DB3의 묵시적 생성자 수행");
		d3 = 10 * 10 * 10 * 10;
	}
	
	//생성자 오버로딩(중첩)
	public DB3(double d) { // 명시적 생성자
		System.out.println("클래스 DB3의 명시적 생성자 수행");
		d3 = d * d * d * d;
	}
}

public class DefaultInheritanceTest2 {

	public static void main(String[] args) {
		DB3 db3 = new DB3(5);
		/*
		 * 클래스 DB1의 묵시적 생성자 수행
         * 클래스 DB2의 묵시적 생성자 수행
         * 클래스 DB3의 명시적 생성자 수행
         * 이렇게 출력됨! 상위 클래스의 묵시적 생성자가 수행이 되는 것! DB3는 같은 클래스니까 생성되지 않음
		 */
		
		System.out.println("10의 2제곱: " + db3.d1);
		System.out.println("10의 3제곱: " + db3.d2);
		System.out.println("10의 4제곱: " + db3.d3);

	}

}
