/*
 * 작성일: 5월 7일 작성자: 장석진
 * 
 * 두 개의 정수를 입력받아 두 수 사이의 모든 합과 짝수의 합, 홀수의 합을 출력하시오.
 * 합을 계산하는 부분은 Sum 클래스로 작성합니다.
 * Sum 클래스는 멤버변수와 3개의 메소드로 구성됩니다.
 * 각 메소드는 2개의 값을 전달받아 합을 계산하고 그 값을 돌려줍니다.
 * 
 * [문제분석]
 *    3개의 메소드 - 전체 합계, 짝수의 합, 홀수의 합;
 *    멤버변수 - sum => 전역변수 (클래스 안에, 메소드 밖에 선언하는 변수)
 *    각 메소드에 접근하여 합계를 계산하려면 반드시 객체를 생성해야 합니다.
 *    객체를 통해서 각 메소드에 접근 할 수 있다.
 *    
 * [알고리즘]
 *    1.클래스 선언 = sum
 *       1-1. 멤버변수 sum을 선언합니다.
 *       1-2. 전체 합계 메소드 - 정수형 선언
 *          1-2-1. 두개의 매개변수를 전달받아 전체 합계 계산
 *          1-2-2. 합계를 돌려준다 - 정수값
 *       1-3. 짝수의 합계 메소드 - 정수형 선언
 *          1-3-1. 두개의 매개변수를 전달받아 짝수 합계 계산
 *          1-3-2. 합계를 돌려준다 - 정수값
 *       1-4. 홀수의 합계 메소드 - 정수형 선언
 *          1-4-1. 두개의 매개변수를 전달받아 홀수 합계 계산
 *          1-4-2. 합계를 돌려준다 - 정수값
 *    
 *    2.메인 메소드가 있는 클래스 선언
 *        2-1. 두 개의 정수를 입력 받는다.
 *        2-2. sum 클래스로부터 객체를 생성한다.
 *        2-3. 객체를 통해 두 정수를 전달하여 계산된 합계를 출력한다.
 */

import java.util.Scanner;

class Sum {
	//멤버 변수 선언. - 속성
	public int sum;  // 멤버변수는 초기화 하지 않아도 된다.
	
	//전체 합계 계산하는 메소드
	public int allSum(int num1, int num2) {
		//입력받은 두 수의 사이의 숫자들을 구하는 코드
		sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		//메소드를 호출한 곳으로 값을 돌려준다
		return sum;
	}
	
	//짝수의 합계 계산하는 메소드
	public int addSum(int num1, int num2) {
		sum = 0;
		for(int i = num1; i <= num2; i++) {
		   if(i%2 == 0) {
			sum = sum + i;
		   }
		}
		return sum;// 짝수의 합 계산
	}
	
	//홀수의 합계 계산하는 메소드
	public int evenSum(int num1, int num2) {
		sum = 0;
		for(int i = num1; i <= num2; i++) {
		if(i%2 != 0) {
		    sum = sum + i;
		   }
	    }
		return sum;// 홀수의 합 계산
	 }
}

public class SumTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("덧셈을 수행할 두 개의 수 입력(작은 수부터 빈칸으로 구분) : ");
		
		int num1 = stdIn.nextInt();
		int num2 = stdIn.nextInt();
		
		//sum 클래스로부터 객체 생성
		Sum s = new Sum();
		
		//입력받은 값은 s 객체를 통해서 Sum 클래스의 allSum()메소드로 전달
		//메소드를 호출하여 계산된 결과를 돌려받아 출력.
		System.out.println(num1 + "부터 " + num2 + "까지의 합: " + s.allSum(num1, num2) );
		System.out.println(num1 + "부터 " + num2 + "까지의 합: " + s.addSum(num1, num2) );
		System.out.println(num1 + "부터 " + num2 + "까지의 합: " + s.evenSum(num1, num2) );
		}

}
