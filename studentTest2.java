/*
 * Shape 클래스를 작성하고 이를 상속받는 Circle 클래스를 작성하세요
 * 
 * Shape 클래스에서는 String color 속성을 추가하고, 이를 설정하는 생성자를 작성합니다
 * Circle 클래스는 Shape 클래스를 상속받고, double radius 속성을 추가하여 이를 설정하는 생성자를 작성합니다
 * Circle 클래스에 원의 면적과 둘레를 계산하는 메소드를 작성합니다
 * 
 * 사용자로부터 원의 반지름과 색상을 입력받아, 해당 원의 정보를 출력하는 프로그램을 작성하세요
 * 
 * [출력결과]
 * 원의 색상을 입력하세요: 빨강
 * 원의 반지름을 입력하세요: 
 */

import java.util.Scanner;

class Shape{
	String color;
	
	public Shape(String color) {
		this.color = color;
	}
}

class Circle extends Shape{
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double result1() {
		return radius * radius * 3.14;
	}

	public double result2() {
		return 2 * radius * 3.14;
	}
}


public class studentTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("원의 색상을 입력하세요: ");
		String color = stdIn.nextLine();
		System.out.print("원의 반지름을 입력하세요: ");
		double radius = stdIn.nextDouble();
		
		Circle c = new Circle(color, radius);
		
		System.out.println("원의 색상: " + c.color);
		System.out.println("원의 반지름: " + c.radius);
		System.out.println("원의 면적: " + c.result1());
		System.out.println("원의 둘레: " + c.result2());

	}

}
