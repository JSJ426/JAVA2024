/* 작성일 : 4월 2일
 * 작성자 : 202295037 장석진
 * 
 * 정수를 입력하시오 : 5
 * ★
 * ★★
 * ★★★
 * ★★★★
 * ★★★★★
 */

import java.util.Scanner;

public class nestedLoopTest02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		//int num = 5;
		int num = stdIn.nextInt(); // 문제는 5입력이지만, 어떤 수를 받아도 출력되도록 수정
		int jul;
		int kan;
		
		for(jul = 1; jul <= num; jul++) { //줄을 바꾸는 코드
			for(kan = 1; kan <= jul; kan++) {  //각 줄의 별을 출력하는 코드
				System.out.print("★");
		}
			
			System.out.println(" ");
   }
 }
}


