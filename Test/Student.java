/*
 *  문제 : student_class 클래스를 작성하시오
 *  (메인 메소드에 포함해서 만들 수 있고, 따로 만들 수 있음,
 *   포함하면 public class, 따로만들면 class)
 *  이 클래스는 다음과 같은 속성을 가집니다
 *  private String name
 *  private int studentId
 *  private double grade
 *  (위 변수는 속성, 멤버변수이다)
 *  
 *  다음 요구 사항을 만족하는 생성자를 작성하시오
 *  기본 생성자: name을 "홍길동", studentId를 0, grade를 0.0으로 초기화합니다
 *  매개변수가 있는 생성자 : 이름, 학생 ID, 학점을 입력받아 초기화합니다
 *  
 *  메소드 : printStudentInfo(): 학생의 정보를 출력합니다
 *  -------------------------------------------
 *  
 *  student 클래스 
 *  main 메소드 : student_class로부터 객체를 두 개 생성하고, 각각의 정보를 출력합니다
 *  
 *  [출력결과]
 *  Name: 홍길동, Student ID: 0, 학점: 0.0
 *  Name: 김지연, Student ID: 202295037, 학점: 3.9
 */
class student_class{
	//속성 - 멤버변수
	private String name;
	private int studentId;
	private double grade;
	
	//생성자 = 매개변수가 없는 묵시적 생성자(학생 정보 기본 세팅하는 기능
	public student_class() {
		this.name = "홍길동";
		this.studentId = 0;
		this.grade = 0.0;
	}
	
	//생성자 오버로딩
	//학생 정보를 전달받아 세팅하는 기능을 가지고 있는 아이
	public student_class(String name, int studentId, double grade) {
		this.name = name;
		this.studentId = studentId;
		this.grade = grade;
	}
	
	//출력을 해야하는 메소드이기 때문에 void가 들어간다
	//학생 정보 출력 메소드
	public void printStudentInfo() {
		System.out.println("Name: " + name + ", Student ID: " + studentId + ", 학점: " + grade);
	}
	
}

public class Student {

	public static void main(String[] args) {
		//매개변수가 없는 생성자 호출하는 객체 생성
		student_class s1 = new student_class();
		//메소드 호출
		s1.printStudentInfo();
		
		
		
		//내 정보를 가지고 생성자 호출하는 방법
		//오버로딩한 생성자 메소드에 값이 들어가서 정해진 값이 출력됨
		student_class s2 = new student_class("장석진", 202295037, 3.9);
		s2.printStudentInfo();

	}

}
