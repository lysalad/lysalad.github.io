
public class StudentGrade {
	private String name;
	private double kor, eng, math, avg;

	public StudentGrade(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor + eng + math) / 3;
	}
	public StudentGrade(){
		// 기본 생성자
	}

	// 도우너의 생성자
	public StudentGrade(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKor() {
		return kor;
	}

	public void setKor(double kor) {
		this.kor = kor;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getAvg() {
		return avg;
		//sum을 하나 만들어서 getSum()/3;해도 된다.
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void printName() {
		System.out.println("이름: " + name);
	}

	public void printAvg() {
		System.out.println("세 과목 평균: " + avg);
	}

	public void printAll() {
		System.out.println("\n국어: " + kor + "점, 영어: " + eng + "점, 수학: " + math + "점");
	}
}