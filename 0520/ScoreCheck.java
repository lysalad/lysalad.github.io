/* 사용자의 점수(정수형)을 입력받아 
60점 이상이면 "합격" 출력 
60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력 */


import java.util.Scanner;

public class ScoreCheck {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		
		if(score >= 60){
			System.out.print("\"합격\"입니다.");
		}
		
		else{
			System.out.println("\"불합격\"입니다.");
			System.out.println("합격까지 \"" + (60 - score) + "점\" 남았습니다.");
			System.out.printf("합격까지 \"%d점\" 남았습니다.", (60 - score));
			// System.out.printf("%s %d", ) 완성하기
		}
		
	}
}