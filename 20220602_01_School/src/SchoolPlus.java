
/*
 
 학생 관리 프로그램
콘솔 입출력
반에 학생들을 등록(최대 3명까지)
3명의 이름 목록을 볼 수도 있어야 한다.
사용자가 등록한 학생 점수의 평균을 볼 수도 있어야한다.
1등 학생의 정보도 볼 수 있다.

부가적인 기능은 자유롭게 만들기

기존에 만들었던 클래스 << 수정을 해야한다면, 수정해야하는 이유와 어떻게 고쳤는지 전 후가 어떻게 바뀌었는지 다 기록

*/

// 6. 새로운 파일을 하나 만들어준다. 여기에서는 앞서 School을 참조한 값들을 다시 받아와서
// 메소드에 넣도록 한다... 굳이 하나를 더 만들어 주는 이유는 더 편하기 때문인데
// 메소드는 이미 만들어진 객체에 들어갈 수 있다. School에서 각종 정보들을 저장해서 객체를 만들어줬다면
// 여기서는 만들어진 객체들을 주로 동작?? 하도록 만드는 메소드들을 만든다.

//11. Scanner를 쓰겠다고 말해준다...

import java.util.Scanner;

public class SchoolPlus {

	// 7. 내가 만든 School이라는 type을 참조해서 만들어진 객체들을 다시 사용할거라고 선언해준다.
	// 이 School을 아주 자연스럽게 마치 원래 있었던 type인 것 처럼 사용해주는 것이 핵심이다.
	private School st1;
	private School st2;
	private School st3;

	Scanner scan = new Scanner(System.in);
	// 8. 이제 나머지는 예전에 School에서 했던 것 처럼 하면 된다.

	public SchoolPlus() {
		// + 필요할 수도 있으니 기본생성자도 하나 만들어둔다.
		// 없어도 되긴 하는데(안보여도 존재는 한다.), 초기화할 수 있는 방법을 여러개 마련해 둔 것이다.
		// 아래 9.처럼 만들면 초기화하는 방법이 1개 이며, 학생 3명에 대한 참조가 무조건 필요하다.
		// 하지만 이렇게 만들어두면 보다 자유롭게, 다양하게 초기화를 할 수 있다.
	}
	
	
	// 9. 학생 세 명을 SchoolPlus 안에 넣어서 초기화 시켜준다.
	// 초기화가 type인 School을 참조한 상태이다.
	public SchoolPlus(School st1, School st2, School st3) {
		this.st1 = st1;
		this.st2 = st2;
		this.st3 = st3;
	}

	
	// + + 이 getter setter를 만드는 이유는
	// 학생 한 명의 참조값을 불러오고 설정해주기 위해서이다.
	// ♨ 앞의 School의 getter setter는 학생 한 명의 국어 점수, 이름, 평균 등을 불러오지
	// 학생 한 명의 참조값을 불러오지는 못하기 때문이다.
	public School getSt1() {
		return st1;
	}


	public void setSt1(School st1) {
		this.st1 = st1;
	}


	public School getSt2() {
		return st2;
	}


	public void setSt2(School st2) {
		this.st2 = st2;
	}


	public School getSt3() {
		return st3;
	}


	public void setSt3(School st3) {
		this.st3 = st3;
	}
	
	// 10. 이제 초기화까지 된 학생 세 명의 정보들을 출력하기 위한 동작들을 만들어준다.
	// 11. 여기서는 getter는 쓰지 않고 setter만 쓰는데, 이름은 아직 사용자가 입력을
	// 안 했기 때문에 불러 올 수 없다. 사용자가 입력한 값으로 초기화 된 것에 끼워줘야한다.
	// 그래서 setter 만 사용한다. setter을 사용하는 이유는 private라서이다.

	// ♨ 12. ()안에 파라미터는 School st가 된다. 왜냐하면
	// School 타입(을 참조하면서 School타입으로 초기화된)학생이 한 명씩 들어갈 것이기 때문이다.
	
	public School setSt(School st) {
		scan.nextLine();
		System.out.println("등록할 학생의 이름을 적어주세요: ");
		String name = scan.nextLine();

		System.out.print("국어 점수: ");
		double kor = scan.nextDouble();

		System.out.print("영어 점수: ");
		double eng = scan.nextDouble();

		System.out.print("수학 점수: ");
		double math = scan.nextDouble();

		st.setName(name);
		st.setKor(kor);
		st.setEng(eng);
		st.setMath(math);
		System.out.println(" "); // 그냥 줄 띄우기 용

		return st;
	}

	// ------------- 14. 여기까지 하면 사용자가 입력한 값으로 다시 세팅이 됐다.

	// 15. 다시 모든 학생 이름을 출력할 수 있는 메소드를 만들어준다.
	// School에서는 객체에 아무것도 입력된 것이 없기 때문에
	// 껍데기(틀) 만 만들어 뒀따. 이제 값을 받아온 객체에서
	// 이름만 빼올 수 있다!
	public void printAllStName() {
		System.out.println("1번 " + st1.getName());
		System.out.println("2번 " + st2.getName());
		System.out.println("3번 " + st3.getName());
	}
	
	// 20. 총 평균 구하는거 깜빡했으,,,,
	public double getTotalAvg() {
		return (st1.getAvg() + st2.getAvg() + st3.getAvg()) / 3;
	}

	// 16. 이제 평균 점수가 1등인 학생을 뽑아낸다. = ♨ 불러올 수 있도록 getter로 만들어준다.
	public School getHighAv() {
		if (st1.getAvg() >= st2.getAvg() && st1.getAvg() >= st3.getAvg()) {
			return st1;
		} else if (st2.getAvg() >= st1.getAvg() && st2.getAvg() >= st3.getAvg()) {
			return st2;
		} else {
			return st3;
		}
	}

	
   // 16-1. 방법이 여러가지이다.
	public School max(School left, School right) {
		if(left.getAvg() >= right.getAvg()) {
			return left;
		} else {
			return right;
		}
	}
	
	// 16-2. 여기는 SchoolPlus가 심판을 보고 비교...? @.@
	public School max2() {
		return max(max(st1, st2), st3);
	}
	
	// 16-3. -> School에 만들었다. 근데 빨간줄뜬다 ㅠㅠ
	// 이건 학생이 스스로 비교하게 만든다.
//	public School max3() {
//		if(st1.compare(st2) && st1.compare(st3)) {
//			return st1;
//		} else if(st2.compare(st1) && st2.compare(st3)) {
//			return st2;
//		}
//	}
	
	
	// 17. 이제 모든 메소드가 준비됐으니 조립해서 과정으로 엮어준다.

//	public boolean check() {
//		return true;
//	}

	public void PlusStart() {
		int x = 0;
		// ♨18. do~while을 쓰고싶은데....
		while (true) {
			System.out.println("선택해주세요.");
			System.out.println("1.학생 등록, 2.등록 확인, 3.학생 세 명의 평균의 평균은?, 4.제일 높은 평균 점수는? 5.종료");
			x = scan.nextInt(); // x가 Int라서 Int로 가야한다.

			switch (x) {
			case 1: // 학생들 정보를 모두 넣어준다.
				st1 = setSt(st1);
				st2 = setSt(st2);
				st3 = setSt(st3); // ♨앞에 this는 왜 생략????
				break; // 

			case 2: // 학생들의 정보를 출력한다.
				printAllStName(); // ♨ 얘는 왜 아무것도 안 달고 혼자 올 수 있지?
				break; // 

			case 3: // 총 평균 구하기
				System.out.println("등록한 학생들의 평균의 평균" + getTotalAvg());
				break;
				
			case 4: // 제일 높은 평균 점수 학생과 정보
				System.out.println("제일 높은 평균 점수의 학생은 ");
				getHighAv().printAllstInf(); // 여기에는 앞에 달아줬는데...?
				break;
				
			case 5: // 종료
				System.out.println("프로그램 종료");
				return; // ♨ 난 뱁새라서 가랭이 다 찢어지네
			}
		}
	}
}
