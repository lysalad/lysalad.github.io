import java.util.Scanner;

public class InputString {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int i = input.nextLine();
		System.out.println("한 줄을 입력하세요: "); // 숫자를 넣으면 프로그램이 종료된다.
		input.nextLine();
		String line = input.nextLine();
		
		System.out.println(i);
		
	}
}

input.nextLine();