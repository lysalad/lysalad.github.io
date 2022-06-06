import java.util.Scanner;

// 자판기라는 객체
	// 넣은 돈을 보여준다.
	// 잔돈을 보여준다.
	// 기능을 고르면 그 기능을 수행한다.
	// 기능 1. 사이다나 콜라 중에 고르기
	// 기능 2. 사이다나 콜라 금액을 넣은 돈에서 빼기 사이다 1300원 콜라 1800원
	// 기능 3. 잔돈을 반환하면 잔돈 빼주기
	
	// 조건 - case를 사용할 것
 	// 앞서 만든 vending을 사용할 것

public class TestVending {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//1. 돈을 입력받는다.
		
		System.out.println("투입한 금액은?: ");
		int input = scan.nextInt();
		int select;
		
		while(true) {
			System.out.println("다음 중 한 가지를 선택해주세요.");
			System.out.println("1. 콜라, 2. 사이다, 3. 계산");
			select = scan.nextInt();
			
			switch(select) {
				
			case 1:
			int result1= input - 1800;
			// System.out.println(result);
			return result1;
			break;
			
			case 2:
			int result2 = input - 1300;
			break;
			
			case 3:
			int resultChange = input - (result1 + result2);
			
			}
		}
	}
}
