/* 사용자의 학점을 입력했을 때,
90점 이상이면 A,
80점 이상 90점 미만이면 B
70점 이상 80점 미만이면 C
60점 이상 70점 미만 D
60점 미만 F */

import java.util.Scanner;
public class GradeCompare{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학점을 입력하세요: ");
		int num = scan.nextInt();
		char grade;
		
		if (num >= 90) {
		    grade = 'A';
		} else if (num >= 80) {
			grade = 'B';
		} else if (num >= 70) {
			grade = 'C';
		} else if (num >= 60) {
			grade = 'D';	
		} else {
			grade = 'F';
		}
		
		System.out.print("당신의 학점은 " + grade);
	}
}
