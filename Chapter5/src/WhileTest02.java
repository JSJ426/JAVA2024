/* 작성일 : 4월 2일
 * 작성자 : 202295037 장석진
 * 설명 : 알고싶은 단을 입력 받아 구구단을 출력하시오.
 * 
 * 문제분석 : 단은 고정이다. 입력 받는다.
 *         곱하는 수는 1부터 9까지 1씩 증가한다.
 *         곱셈의 결과는 단 * 수 이다.
 *         구구단 곱셈의 과정이 하나씩 출력돼야 한다.
 * 
 * 알고리즘 : 1. 단을 입력 받는다.(정수)
 *         2. 곱하는 수는 1부터 (초기값)
 *         3. 곱하는 수는 9까지 반복하면서 (조건식)
 *            3-1. 구구단 출력한다.
 *            3-2. 곱하는 수를 1씩 증가시킨다. (증감식)
 *            
 */

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		//객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		//1. 단을 입력 받는다.
		System.out.print("알고 싶은 단 입력: ");
		int dan = stdIn.nextInt();
		
		//2. 곱하는 수는 1부턴
		int su = 1;
		
		//3. 곱하는 수를 9까지 반복하면서
		while(su <= 9) {
			//1)구구단을 출력한다.
			System.out.println(dan + "X" + su + "=" + dan*su);
			su++;  // 2)곱하는 수를 1씩 증가
		}
	}

}
