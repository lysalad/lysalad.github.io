/* 사용자가 정수를 입력했을 때 
짝수면 "짝수입니다" 출력하기 */

import java.util.Scanner;
public class IfEven { 
	public static void main (String [] args) {
		
		// if () {
			// // 문장1
			// // 문장2
		// }
		
		// else {
			// // 문장3
			// // 문장4
		// }
		
		// //문장 5
		
		// /* if가 참이면 if절만 
		// if가 거짓이면 else만 수행된다.*/
		
		
		
		
		
		
		

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();
		
		if((num % 2) == 0 ) {
			System.out.println("짝수입니다.");
		}
		
		// if((num % 2) > 0 ) 
		else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("프로그램 종료.");
		
	}
}