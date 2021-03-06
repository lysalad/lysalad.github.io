
// 예시로 객체 '박스'를 만들자.
public class Box {
	/*상자의 값과 상태는 (member variable) / 필드 (fields)
	'상자'라는 이름은 우리가 전부 가지고 있지만, 어떤 상자인지는 각각 다르게 생각하고 있다.
	따라서 우리는 어떤 상자를 만들지를 합의하고 이를 표현하기 위한 코드를 만들어야한다.*/

	int length;
	int width;
	int height;
	// int volume = length * width * height;
	
	// 기능과 동작은 메소드로 표현한다.
	public void printAllstate() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
	
	// 동작을 더 만들어보자
	// 박스는 자기자신의 부피를 구해서 정수형 값으로 "알려줄 수 있다."
	// "알려줄 수 있다" 는 것에 초점을 맞춰서 메소드로 만들어보자.(=반환을 해보자)

	// 파라미터에 아무것도 넣을 필요가 없는게, 자기 자신의 가로, 세로, 높이 값을 이미 이름으로 이미 가지고 있다.
	// 그게 겉으로는 보이지 않아도 이미 가지고 있기 때문에 상호작용을 하는 순간 밖으로 나온다. ????
	
	public int getVolume() {
		//자기가 가지고 있는 상태값에 따라서 계산해서 알려줄 수 있게
		return width * length * height;
	}
}