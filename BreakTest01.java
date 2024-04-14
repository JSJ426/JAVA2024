/* 작성일 : 4월 12일
 * 작성자 : 202295037 장석진
 * 설명 : 1부터 10까지 합을 출력하시오(무한반복)
 * 
 * 문제분석 : 1+2+3+4+5+6+7+8+9+10
 *         1부터(초기값)
 *         10까지(조건식)
 *         1씩 증가(증감식)
 *         하면서 합계를 계산한다.
 *         sum = sum + num 공식
 *         sum = 0초기값 지정이 반드시 필요하다.
 *         어디서 멈출건지 확인 후 break
 * 
 * 알고리즘 :
 *     0. sum = 0을 초기값을 지정한다.
 *     1. 수는 1부터 수는 10까지 1씩 증가 반복(초기값)(조건식)(증감식)
 *        1-1. 합계를 계산한다.
 *     2. 합계를 출력한다
 */

import java.util.Scanner;

public class BreakTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("수를 입력하세요");
		
		int input_num = stdIn.nextInt();
		int num = 1;
		int sum = 0;
		
		/*
		while(true) {
			sum = sum + num;
			if(num == input_num) {
				break;
			}
			num++;
		}// 55가 나온다
		
		while(true) {
			if(num > input_num) {
				break;
			}
			sum = sum + num;
			num++;
		}// 55가 나온다
		*/
		
		while(true) {
			sum = sum + num;
			num++;
			if(num > input_num) {
				break;
			}
		}
		System.out.println("1부터 입력한 수의 합은: " + sum);
		
		}

}
