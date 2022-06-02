// 교재 200pp. TestCar.java와 함께 봐야한다.


//prinvate = 접근 제한자
public class Car {
	private int speed;
	private int gear;
	private String color;
	
	//첫 번째 생성자
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	/*
	public Car(String c) {
		3개를 초기화 하고 있다. 하지만 이건 바로 위에 잘 만들어 뒀다.
		만들어둔 걸  호출만 하면 된다.
		c2 c3는 색깔만 나오고 나머지는 임의의 초기화 값으로 나온다.
		
		color = c;
		speed = 0;
		gear = 1;
	}
	*/
	
	// 자기 자신(자기 자신의 참조)의 생성자를 호출하고 싶어서 만들어졌다.
	// 위에 적은 /* */와 결론적으로는 똑같다.
	public Car(String c) {
		/*
		자기자신 중에서 파라미터의 순서와 갯수 타입이 똑같은 것을 찾아준다.
		목적은 결국에 필드의 초기화를 위해서이다.
		초기화의 목적에 대해 잘 이해하면 된다.
		*/
		this(c, 0, 1);
		
		System.out.println("초기화 과정 중~");
	}
	
	//색상에 접근하기
	public String getColor() {
		return color;
	}
	// 색상 값을 변경할 수 있도록 설정
	public boolean setColor(String c) {
		color = c;
		
		if (c != null) {
			color = c;
			return true;
		} 
		return false;
	}
	
	
	//기어에 접근하기
	//getter 접근자
	public int getGear() {
		return gear;
	}
	// setter 설정자
	public void setGear(int g) {
		gear = g;

	}

	
	//속도에 접근하기
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		speed = s;
	}
}