import java.util.Scanner;

public class JSJ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("학점을 입력하세요: ");
		int score = stdIn.nextInt();
		
		if(score >= 0 && score <= 100) {
			
			if(score >= 90 && score <= 100){
				System.out.println("A학점입니다.");
			}
			else if(score >= 80 && score < 90) {
				System.out.println("B학점입니다.");
			}
			else if(score >= 70 && score < 80) {
				System.out.println("C학점입니다.");
			}
			else if(score >= 60 && score < 70) {
				System.out.println("D학점입니다.");
			}
			else if(score >= 0 && score < 60) {
				System.out.println("F학점입니다.");
			}

		}
	
		else {
			System.out.println("잘못된 점수입니다.");
		}
			
	}

}
