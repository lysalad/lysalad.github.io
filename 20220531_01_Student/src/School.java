
/* 학급(반)
 학생
 학생
 학생
 
 1. 3명의 학생의 이름을 콘솔에 출력할 수 있다.
 2. 학생 3명의 총 평균을 알려줄 수 있다.(평균의 평균)
 3. 평균이 가장 높은 학생(참조, 리턴 타입이 학생이어야 한다???)을 알려줄 수 있다. -> 동일 점수일 경우에는 1 < 2 < 3 순으로 

------------------------------------------------------------------- 

 학생 이름 + 평균 점수 해서 만들면, 학생 이름만 불렀을때는 점수가 0점이 되어버리고,
 점수만 불렀을때는 학생이름이 null이 되버린다. 이걸 어떻게 해결하지???
 그래서 이름과 점수를 각각 따로 만들고 각 이름과 점수를 하나씩 불러올 수는 있게끔 만들어놓았... 나 ???

------------------------------------------------------------------- 
다시다시다시다시다시다시다시다시다시

우리가 원래 만들었던 StudentGrade를 사용한다.
StudentGrade를 사용하면 따로 새 파일을 만들지 않아도 1과 2를 할 수 있다.
3을 해결하면 된다.

학생 관리 프로그램
콘솔 입출력
반에 학생들을 등록(최대 3명까지)
3명의 이름 목록을 볼 수도 있어야 한다.
사용자가 등록한 학생 점수의 평균을 볼 수도 있어야한다.
1등 학생의 정보도 볼 수 있다.

부가적인 기능은 자유롭게 만들기

기존에 만들었던 클래스 << 수정을 해야한다면, 수정해야하는 이유와 어떻게 고쳤는지 전 후가 어떻게 바뀌었는지 다 기록
*/

/*
 1. 일단 여기에서 이미 학생의 이름과 정보를 구할 수 있도록 만들어 뒀다.
 그래서 여기는 학생의 이름과 정보(점수, 평균점수)를 참조할 수 있는 곳으로 만든다.
 */

public class School {
	// 어차피 이름은 하나만 설정해줘도 새로 참조값을 만들면 된다. 바부양!!
	// 여기다가 세 명 만드는게 아니야!
	private String name;
	private double kor, eng, math, avg;

	public School(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
	}
	
	// 이름만 전달받았을 때 나머지는 초기화상태가 되도록 해준다.
	public School(String name) {
		this.name = name;
	}

	public School() {
		// 이 빈 공간은 원래는 아래 주석처리된 평균값을 구하기 위한 빈... 참조값?이었는데
		// 이제는 새로 학교에 나타난 학생들이 참고하는 곳이 되었다.
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
		return (kor + eng + math) / 3;
		// sum을 하나 만들어서 getSum()/3;해도 된다.
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	

	public void printNameOne() {
		System.out.println("이름: " + name);
	}

	public void printAvg() {
		System.out.println("세 과목 평균: " + avg);
	}
	
	// 3. 여기에 학생과 학생의 정보를 참조할 것이기때문에, 새로 만들어진 학생들 객체의 정보를
	// 한 번에 출력할 수 있는 메소드도 여기에다가 만들어준다.
	// 고생해서 getter setter많이 만들어 놔서 필요한 정보들을 모두 구할 수 있다!
	
	public void printAllstInf( ) {
		System.out.println("이름: " + getName());
		System.out.println("국어 점수: " + getKor());
		System.out.println("영어 점수: " + getEng());
		System.out.println("수학 점수: " + getMath());
		System.out.println("세 과목 평균: " + getAvg());
		
	}
	
	//16-3. 근데 이건 왜 여기다가 만들어주시는지?
	public boolean compare(School other) {
		return this.getAvg() >= other.getAvg();
	}

	/* 
	 * 2. 이 부분은 이제 필요없어지므로 주석처리
	 public void MaxAvg(String name1, String name2, String name3, double avg1, double avg2, double avg3) {
	 
		if (avg1 >= avg2 && avg1 >= avg3) {
			System.out.println("평균  점수가 제일 높은 학생은?: " + name1);
		} else if (avg2 >= avg1 && avg2 >= avg3) {
			System.out.println("평균 점수가 제일 높은 학생은?: " + name2);
		} else {
			System.out.println("평균 점수가 제일 높은 학생은?: " + name3);
		}
	}

	public String MaxAvg2(String name1, String name2, String name3, double avg1, double avg2, double avg3) {
		if (avg1 >= avg2 && avg1 >= avg3) {
			return name1;
		} else if (avg2 >= avg1 && avg2 >= avg3) {
			return name2;
		} else {
			return name3;
		}
	} */

}