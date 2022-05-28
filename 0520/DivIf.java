/* 정수 두 개를 입력했을 때 큰 수에서 작을 수로 나눈 몫과 나머지를 출력하기 */

import java.util.Scanner;
public class DivIf {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 입력하세요: ");
		int num2 = scan.nextInt();
		int div;
		int mod;
		
		//0을 넣으면 프로그램이 종료되는 걸 방지하기 위해서 넣어주는 조건문
		if (num1 != 0 && num2 != 0) {
			
			if(num1 >= num2) {
				div = num1 / num2;
				mod = num1 % num2;
			}
		
			else {
				div = num2 / num1;
				mod = num2 % num1;
			}

			System.out.println("몫은 " + div);
			System.out.println("나머지는 " + mod);
			System.out.println("\n프로그램 종료");
		}
		
		System.out.println("0은 입력할 수 없습니다.");
	}
}