
//파라미터와 arguments는 결국 같아진다.
//차이는 있지만...
// method1(int param) {
	
// }

// //호출할 때 집어넣는 값이 arguments 이다.
// method(109); {
	
// }




class Car {
	
	String color; // 모델
	int speed; // 현재 속도
	int gear; // 현재 기어 단수
	
	void print() { //여기가 메소드
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");
		// System.out.printf("(%d, %d, %d)" color, speed, gear);
		
	}
}

public class CarTest {
	
								//이 args가 arguments의 약자
	public static void main(String[] args) {
		//Car = type, myCar는 클래스 이름, 즉 car라는 type에다가 my car라는 클래스를 사용하겠따?
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		//blue, threh 60, 기어 3 자동차 인스턴스 만들고 값을 대입연산
		// 해당하는 참조연산 이름으로 프린트해서
		// 문제를 이해하지 못했다......
		
		//여기는 myCar의 색을 그냥 바꾼거
		myCar.color = "blue";
		myCar.speed = 60;
		myCar.gear = 3;
		myCar.print();
		
		//여기는 새 자동차를 만든것
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
		yourCar.print();
		
		{
			int a = 100;
			Car someCar = new Car();
		}
		
	}
}