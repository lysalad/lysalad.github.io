//사용자의 나이와 이름을 입력해서, 자기랑 같으면 true 출력하기

import java.util.Scanner;

public class AgeName {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = scan.nextInt();
		System.out.println("이름을 입력해주세요.");
		scan.nextLine();//보이지는 않지만 엔터로 입력한 \n을 가져오는 명령
		// Line의 기준은 Enter, 그냥 next는 스페이스를 기준
		String name = scan.nextLine();
		
		System.out.println("확인: " + age);
		System.out.println("확인: " + name);
		
		System.out.println(
		(age == 18) &&
		name.equals("박민"));
	}
}
