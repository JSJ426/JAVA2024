/*작성일: 4월 12일
 *컴퓨터공학 202295037 장석진
 */
public class BreakTesk02 {

	public static void main(String[] args) 
	{
		int i, j;
		for( i=1; i<10; i++) 
		{
			for( j=1; j<i; j++) 
			{
				if(j>6) {
					break;
				}
				System.out.print("♥");
			}
			System.out.println("");
		}
    }
}
