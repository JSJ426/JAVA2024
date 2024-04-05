/* 작성일 : 4월 2일
 * 작성자 : 202295037 장석진
 * 설명 : 정수를 입력 받아 정수의 팩토리얼 값을 출력하시오.
 * 
 * 문제분석 : 5! = 5*4*3*2*1 => 120
 * 
 * 알고리즘 :
 */

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
	
		int num = stdIn.nextInt();
		int sum = 1;
		
		System.out.print(num);
		
		while(num > 1) {
			sum *= num;
			num--;
		}
		System.out.print("! =" + sum);
			

	}

}
