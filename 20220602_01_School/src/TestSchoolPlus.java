

	// 세 학생의 평균 중 제일 높은 평균을 출력하기 위해서는 메소드가 필요한데,
	// 그 메소드를 여기다가 만들어야하나?
	// 왜 School에는 만들면 안되는거지?
	
	
		
		/*
		 ---------------------------------------------------------------
		 * 여기는 값을 임의의 값을 직접 줬을 때
		ClassList st = new ClassList();
		ClassList st1 = new ClassList("학생1", 55, 72, 34);
		ClassList st2 = new ClassList("학생22", 88, 69, 47);
		ClassList st3 = new ClassList("학생333", 55, 90, 32);
		
		// 여기서 getName을 하면 새로 생성된 st1~3까지의 객체가 getName을 참조한 값을 name1~3에 저장
		String name1 = st1.getName();
		String name2 = st2.getName();
		String name3 = st3.getName();
		
		// getAvg도 마찬가지로 새로 생성된 st1~3까지의 객체가 getAvg를 참조한 값을 avg1~3에 저장
		double avg1 = st1.getAvg();
		double avg2 = st2.getAvg();
		double avg3 = st3.getAvg();	
		double AvgAvg = (avg1 + avg2 + avg3) / 3;
	
		// 1번 - 학생 3명 이름 출력하기
		// 2번 - 평균의 평균 구하기
		System.out.println(name1 + " " + name2 + " " + name3);
		System.out.println("세 학생의 평균의 평균: " + AvgAvg);
		st.MaxAvg(name1, name2, name3, avg1, avg2, avg3);
		
		// 이때 이런 형태로 가능했던 것은 st라는 객체를  단순히 정보들을 모두 받아와서 저장하기 위한 값으로
		 * 만들어 줬기 때문이다.
		String maxAvg2 = st.MaxAvg2(name1, name2, name3, avg1, avg2, avg3);
		System.out.println("평균 젤 높은 사람: " + maxAvg2); 
		
		---------------------------------------------------------------
		*/
		
		 /*
		  * 사용자에게 값을 입력받아서 만들 때는  우선 사용자가 입력한 값들로 만들어지는 객체를
		 만들어내야 한다. 이렇게 객체가 만들어지는 동작을 메소드로 Class List에 만들어줘야한다.
		 사용자에게 받을 정보는 학생의 이름, 학생의 국어, 영어, 수학 점수(3개의 값)이다.
		 정리하자면, 내가 만들어내야 하는 것은 
		 
		
		 1. 학생의 이름, 학생의 국어, 영어, 수학 점수로 이루어진 객체가 만들어지도록 하는 동작
		 (최대 3개까지 만들어 질 수 있도록 한다.) -> School에서 이미 해두었다.
		 2. 만들어진 객체들의 이름만 가지고 나오는 메소드(getter만 필요한 것 같다.) -> School에 있다.
		 3. 만들어진 객체들의 국어, 영어, 수학 점수를 가지고 나오는 메소드(이것도  getter만 필요한 것 같다)
		 4. 메소드들을 통해서 나온 이름과 점수들로 다시 그 중에 제일 높은 평균값을 가지는 학생을 찾아내는 메소드
		 
		 <??? 어디에다가 만들어야할 지 모르겠다.>
		 5. 이 메소드들을 차례대로 실행시킬 수 있는 연결들
		 
		 */
	public class TestSchoolPlus {	
	public static void main(String [] args) {
		// 4. School을 참조할 학생 3명을 만들어준다.
		// 5. 그러면서 빨간줄이 나오는데....... School이 5월 31일에 가있어서 그랬다...
		// 쥔짜 웨구뤠 정말 쥔짜 20분동안 식은땀흘렸네 -> 다음은 SchoolPlus
		
		School st1 = new School(); //새로운 학교에 등장한 1번 학생
		School st2 = new School();
		School st3 = new School();
		
		// ♨19. 만들어진 Start를 실행시킬 객체를 하나 만들어줘야한다.
		SchoolPlus room = new SchoolPlus(st1, st2, st3);
		room.PlusStart(); //...그리고 아무것도 실행되지 않았다...
		
		
		
	}
}
	
	// 우움,,, 갑자기 avg가 안나온당...
	// 집에가서 다시 봐야할듯 ㅠㅠ
	