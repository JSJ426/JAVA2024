/*
 * 작성일:  4월 16일
 * 작성자: 컴퓨터공학과 202295037 장석진
 * 설명: 배열에 저장된 값 중 최대값과 최소값을 출력하시오.
 * 
 * 최대값, 최소값을 찾기 위해서 필요한 것
 * 반드시 비교대상이 필요합니다.
 * 예를들어 배열의 값이 이럴 때{34, 23, 56, 12, 77}
 * 
 * 첫번째 값을 기준으로 비교를 합니다. => 0번지에 저장된 데이터
 * 비교하여 큰 값은 max변수에, 작은 값은 min변수에 저장합니다.
 * 
 * 비교대상인 0번지 값을 비교할 필요가 없다.
 * 반복은 1번지부터 하면 된다.
 */

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//배열 생성 및 초기화
		int num[] = {34, 24, 100 , 5, 78};
		//비교 기준 설정
		int max = num[0];
		int min = num[0];
		
		int i = 1;
		//배열을 반복하면서 비교하여 최대값 최소값을 찾는다
		for(i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
			
		}
		System.out.println("max는 " + max + "입니다.");
		System.out.println("min는 " + min + "입니다.");
		
		
		
		//확장된 for문
		//비교 기준 설정
		max = num[0];
		min = num[0];
		System.out.println("확장된 for문");
		
		for(int j:num) {//null배열에 저장된 값을 차례대로 j에 저장하여 실행됩니다.
			if(max < j) {
				max = j;
			}
			if(min > j) {
				min = j;
			}
			System.out.println("max는 " + max + "입니다.");
			System.out.println("min는 " + min + "입니다.");
	}

}
}
