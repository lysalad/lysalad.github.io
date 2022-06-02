public class StaticVariableAndConst03 {
	
	/* 전역변수 두둥 등장! 전역 변수 앞에는 static이 붙어있다.
	넓은 범위에 전부 영향을 준다.
	
	전역 변수가 많아지면 많아질수록 헷갈릴 일이 많다.
	어느 영역에서든 전역 변수에 접근이 가능하고, 어느 영역에서도 변할 수 있기 때문이다.
	이런 이유로 최근의 개발자들은 전역변수를 사용하는 걸 많이 꺼린다.
	
	잘 쓰지도 않는 걸 왜 배우냐? 라고 하면, 전역 변수를 상수화 시키면 (final로 만들면)
	어느정도 관리가 가능하기 때문이다.
	
	전역변수를 사용하는 일은 최대한 없도록 하되, 꼭 사용할 일이 있다면 final로 사용하면 좋다.*/
	
	/* class 안에는 member가 존재한다. 멤버 안에는 field와 method 등이 있다.
	메소드 앞에는 static이라는 말이 붙어있는데, 직역하면 "정적인~" 이라는 말이다.
	이들은 class와는 별개로 존재하는 "객체"들이다. 
	
	예를들어 우리가 자주 사용했던 Scanner 등은 이름을 가지는 참조를 만들어서 사용했다.
	하지만 static이 붙은 method는 class 이름으로 바로 호출이 가능하다.
	그래서 밑에 test();가 붙은건데 사실 풀어서 쓰자면 StaticVariableAndConst03.test();이다.*/
	
	public static final int NUMBER = 100; 
	
	public static void test() {
		// NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		// NUMBER++;
		System.out.println("메인메소드에서 : " + NUMBER);
		
		test(); // 이건 왜 넣은거지? + 위의 설명대로라면... 얘는 위치가 왜 여기인거지? 제일 앞에 와야하는 게 아닌가?
		
		/* PI는 원래 약속되어 있는 수, final이고 상수값이다.*/
		System.out.println(Math.PI);
		// Math.PI++; //그래서 ++가 붙으면 에러가 난다.
		
		// 절대값을 구하는 static method
		double a = Math.abs(-372);
		System.out.println(a);
		
		// 0~1사이의 랜덤한 실수를 만들어내는 static method
		double r = Math.random();
		r = (int) (r * 10); // 10을 곱한 다음 정수형으로 강제로 바꿔준다. 그러면 출력이 정수형태로 나오기도 한다.
		System.out.println(r);
		
		//하지만 그냥 random method가 잘 되어있기때문에, 그걸 사용하는 편이 좋다.
	}
}

/* ~ 이런 흐름의 연장에서 객체지향이 등장했다. 패러다임이라고 한다. 그 덕에 지금은 객체지향을 가장 널리 사용한다.
java는 객체지향 프로그램을 따르는 언어체계를 가지고 있다. 이제 우리가 객체를 만들어볼 차례!*/