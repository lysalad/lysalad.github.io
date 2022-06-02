// 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자
// getter/setter

// 자기 평균 점수를 알려줄 수 있다.


public class StudentGrade {
	private String name;
	private double kor, eng, math, avg;
	
	public StudentGrade(String name
						, double kor
						, double eng
						, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor + eng + math) / 3;
	}
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	
	
	public double getKor() {
		return kor;
	}
	public void setKor() {
		this.kor = kor;
	}
	
	
	public double getEng() {
		return eng;
	}
	public void setEng() {
		this.eng = eng;
	}


	public double getMath() {
		return math;
	}
	public void setMath() {
		this.math = math;
	}
	
	
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = avg;
	}
	
	
	public void printName() {
		System.out.println("이름: " + name);
	}
	
	public void printAvg() {
		System.out.println("세 과목 평균: " + avg);
	}
	
	public void printAll() {
		System.out.printf("\n국어: " + kor + "점, 영어: "
						+ eng + "점, 수학: " + math + "점");
	}
}