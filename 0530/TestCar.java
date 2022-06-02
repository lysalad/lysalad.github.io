public class TestCar {
	public static void main(String [] args) {
		// Car c = new Car(); 이렇게 하면 에러 이렇게 생긴 애 없음
		
		//Car 에 만들어놓은 두 개 중 하나를 골라서 써야한다.
		Car c = new Car("green", 10, 1);
		
		// 색만 정해져있고 나머지는 아직 임의의 숫자일 때
		Car c2 = new Car("yellow");
		Car c3 = new Car("red");
		
		/*
		 c.color = "빨강";
		 System.out.println(c.color);
		 이렇게 사용할 일은 거의 없고, 객체지향으로 아래와 같이 사용한다.
		*/
		
		/*
		String color에 private가 붙어있을 때는
		컴파일 에러가 난다.
		private는 외부에서 접근이 안되기 때문이다.
		TestCar는 외부, Car라는 자기 자신에서만 사용 가능하다.
		private을 써서 얻을 수 있는 건 ? = 정보의 보호
		밖에서는 보지 않아도 되는 정보를 숨겨둔다.
		
		정보와 몸이 떨어져 있으니까,
		정보랑 몸을 하나로 이어주는데, private는 자기 자신 안에서만
		public은 공개니까 말그대로 상관없음!
		
		캡슐화 + 추상화 = 정보를 외부에서 보호할 수 있도록 감추어 놓는 것
		 */
		 
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		/* public한 getSpeed 메소드를 통해
		speed 값에 접근이 가능하고
		public한 setSpeed 메소드를 통해
		speed 값 변경이 가능하도록 코드 작성하기
		
		gear도 마찬가지로 */
		
		g.setGear(3);
		System.out.println(g.getGear());
		
		g. setSpeed(10);
		System.out.println(s.getSpeed());
		
	}
}