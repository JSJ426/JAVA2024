/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 202295037 장석진
 * 설명 : 3항 연산자.
 *       정수를 입력 받아 짝수인지 확인하는 프로그램
 */

import java.util.Scanner;

public class TernaryOpTest {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = stdIn.nextInt();
		
		boolean result;  //boolean == true, false 값만 출력
		result = (num % 2 == 0) ? true : false;
		
		System.out.print(num + "은 짝수입니까? ");
		System.out.println(result);

	}

}
