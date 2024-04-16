/*
 * 작성일:  4월 16일
 * 작성자: 컴퓨터공학과 202295037 장석진
 * 
 * 
 * 설명: 1차원 배열에 정수 값을 저장하여 생성하시오
 *     사용자로부터 정수를 하나 입력받아 그 정수가 어디에 몇개 있는지 출력하시오.
 *     입력한 값이 배열에 없다면 "입력한 값이 없습니다."를 출력하시오
 *     
 * 비교대상이 있어야함(0번지부터 끝까지 같은지 비교합니다.)
 * 주소가 몇번인지 출력해줍니다(번지수를 체크할 때마다 개수를 세어줍니다.)
 * 
 * 알고리즘:
 *     1. 배열에 정수 값을 지정합니다.
 *     2. 사용자로부터 찾고 싶은 정수를 입력받습니다.
 *     3. 차례대로 증가시키면서 입력받은 정수와 같은지 확인합니다.
 *         3-1. 입력 받은 수와 배열 각 번지에 저장된 값이 같은지 비교합니다.
 *            input_num == num[i]
 *            3-1-1. 같은 수가 있으면 count를 증가시킨다.
 *            3-1-2. 현재 위치의 번지를 출력한다.
 *            
 *     4. count가 0이면 일치하는 값이 없다, 아니면 입력한 수가 몇개 있는지 출력합니다
 */

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		System.out.print("값을 입력하세요: ");
		Scanner stdIn = new Scanner(System.in);
		int num[] = {4, 58, 446, 354, 43, 246, 65, 27, 58, 0, 4, 4};
		int count = 0;
		int i;
		int input_num = stdIn.nextInt();
		
		for(i = 0; i < num.length; i++) {
			if(input_num == num[i]) {
				count++;
				System.out.println("num[" + i + "]데이터와 일치");
			}
		}
				
				if(count == 0) {
					System.out.println("같은 값이 없습니다.");
				}
				else {
					System.out.println("같은 값은 " + count + "개 입니다.");
				}
			}
			
		}


