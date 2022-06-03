
public class TestStudent {
	public static void main(String [] args ) {
		//생성자와 모양이 항상 같아야한다.
		StudentGrade student1 = new StudentGrade("홍길동", 100, 90, 80);
		double avg1 = student1.getAvg();
		System.out.println(avg1);
		
		StudentGrade student2 = new StudentGrade("둘리", 60, 70, 80);
		StudentGrade student3 = new StudentGrade("도우너"); //도우너 점수는 빵점이다. 나머지가 초기화된 값으로 나오기 때문이다.
		
		double avg2 = student2.getAvg();
		double avg3 = student3.getAvg();
		
		double sum = avg1 + avg2 + avg3;
		double totalAvg = sum / 3;
		
		System.out.println(totalAvg);
	}

}
