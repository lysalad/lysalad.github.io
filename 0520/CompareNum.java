//3개의 정수를 입력했을 때, 가장 큰 수 찾아내기

import java.util.Scanner;
public class CompareNum {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("3개의 정수를 입력하세요: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max;
		//우선 두 개 부터 비교해보자...
		//내가 한 거 완전 망함 자꾸 num1,2랑 num3이 같이 출력됨
		// if((num1 > num2) == (num1 > num3)){
			// System.out.print(num1);
		// }
		
		// if((num2 > num1) == (num2 > num3)){
			// System.out.print(num2);
		// }
		
		// else{
			// System.out.print(num3);
		// }

		if (a > b) {
			if (a > c) {
				max = a;
			}
		}

	}
}
