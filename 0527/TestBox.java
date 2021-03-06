public class TestBox { //Box.java와 함께
	public static void main(String[] args) {
		
		
		// Box라는 클래스가 하나의 Type(참조 변수)으로 사용된다고 선언한다.
		// Box라는 java 파일을 같은 폴더 안에 만들어놔야 참조가 된다.(=경로가 같아야한다.)
		Box box1; 
		box1 = new Box(); //박스 인스턴스가 하나 만들어졌고, 이 인스턴스가 참고하는 참조 변수도 만들어졌다.
		
		// System.out.println(box1.color); //이렇게 하면 color라는 field가 없다고 바로 compile에서 알려준다.
		
		// .은 참조형 변수 안을 보는 게 아니라, 참조형 변수가 가리키는 instance 속을 보는 것이다.
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		Box box2 = new Box();
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		/* 여기서 만드는 박스는 동작(기능)을 할 수 있다.
		만들어보자 그다음 출력! - box.java에 */
		
		box1.printAllstate();
		box2.printAllstate();
		
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
	}
}

/* 인스턴스는 박스의 가로 세로 높이로 값을 가질 수 있는 공간이 생긴다.
인스턴스를 만들어 줬다는건 공간을 줬다는 말 이다.
 box1 과 box2 는 별개의 인스턴스지만 그 안에 값은 가로 세로 높이로 같다. 이는 박스의 특징이다.
 가로, 세로, 높이는 변수로 아직 초기화도 선언도 안되어있기때문에 이 작업이 필요하다.*/