
import java.util.Scanner;
public class TestStudentGrade {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.print("국어 점수는?: ");
		double kor = scan.nextDouble();
		
		System.out.print("영어 점수는?: ");
		double eng = scan.nextDouble();
		
		System.out.print("수학 점수는?: ");
		double math = scan.nextDouble();
		
		
		
		/*
		StudentGrade sGrade = new StudentGrade("장현중"
												, 60
												, 70
												, 50);
													*/
												
		StudentGrade sGrade = new StudentGrade(name , kor, eng, math);
		sGrade.printName();
		sGrade.printAvg();
		sGrade.printAll();
	}	
}