/* 작성일: 4월 12일
 * 컴퓨터공학 202295037 장석진
 *
 * 설명: 점수를 입력 받아 합계와 평균을 출력하시오.
 *     음수가 입력되면 점수 입력이 종료됩니다.
 *     100점 초과의 점수는 계산에 포함되지 않습니다.
 *     
 * 문제분석:
 *     계속해서 점수를 입력 받는다 => 무한반복
 *     점수를 입력 받고 나면 합계를 구하고 이에대한 평균을 구해 출력한다.
 *     음수가 입력되면 즉시 입력이 종료된다.
 *     100점 초과의 점수는 입력이 종료되지 않으나 계산에 포함되지 않는다.
 * 
 * 
 * 알고리즘:
 *     계속 점수를 입력 받기 위해 객체를 생성합니다.
 *     점수가 음수일 경우 프로그램이 종료되도록 코드를 작성합니다.
 *     점수가 100보다 클 경우 재입력하도록 코드를 작성합니다.
 *     잘못된 입력이 없을 경우 입력한 값의 합을 구합니다.
 *     몇번 입력받았는지 알기 위해서 카운트를 생성합니다.
 *     이후 평균을 구합니다.
 *    
 */

import java.util.Scanner;

public class CountinueBreak01 {

	public static void main(String[] args) {
		
		int sum = 0 , count=0;
		
		while(true) {
			Scanner stdIn = new Scanner(System.in);
			System.out.print("점수를 입력하세요");
			int score = stdIn.nextInt();
			
			
				if(score< 0) {
					System.out.println("음수는 입력x");
					break;
				}
				
				if(score > 100) {
					System.out.println("100점이 최대입니다. 다시 입력하세요.");
					continue;
				}
				
				else {
				sum += score;
				count++;
				}
				
			 
			}
		 
		    System.out.println("합계는: " + sum+ "입니다.");
			System.out.println("개수는: " + count + "입니다.");
			System.out.println("입력받은 점수의 평균은: " + sum/count + "입니다.");
		}
		
	}


