// 정수 2개와 연산자(문자열 + - * /)등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;
public class Cal {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//
		System.out.print("정수를 입력해주세요: ");
		int num1 = scan.nextInt();
		
		System.out.print("+, -, *, / 를 선택해주세요: ");
		scan.nextLine();
		String cal = scan.nextLine();
		
		System.out.print("정수를 입력해주세요: ");
		int num2 = scan.nextInt();
		
		//result = "입력하세요";
		int result;
			if (cal.equals("+")) {
				System.out.println("정수를 덧셈하기");
				// result = string.valueOf(num1 + num2);
				result = (num1 + num2);
			} else if (cal.equals("-")) {
				System.out.println("정수를 뺄셈하기");
				result = (num1 - num2);
			} else if (cal.equals("*")) {
				System.out.println("정수를 곱셈하기");
				result = (num1 * num2);
			} else {
				System.out.println("정수를 나누기");
				result = (num1 / num2);
			}
			
		System.out.println("\n계산 결과는?: " + result);
	}
	
}
	