public class Box { //박스를 표현하기 위해서 static을 뗐다.
	int width;
	int length;
	int height;
	
	//생성자 이용해보기
	public Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	// 여러개의 생성자를 만들때는 파라미터를 주의한다.
	// 파마리터의 타입, 순서, 갯수가 같으면 안 된다.
	// 기본 생성자 만들기용
	public Box()  {
		width = 1;
		length = 1;
		height = 1;
	
	}
	
	// 박스를 표현하지 않으려고 static을 붙였다.
	// 기본 생성자로 초기화된 걸 확인했다.
	public static void main(String [] args) {
		
		// 다시 초기화된 박스를 만들고 싶다고 이렇게 만들면
		// Compile error가 난다.
		Box b3 = new Box();
		
		
		
		
		/*
		Box b = new Box(50, 60, 70);
		
		System.out.println(b.width);
		System.out.println(b.length);
		System.out.println(b.height);
		
		//박스 하나를 인스턴스화, 생성자를 호출해서
	    // 가로 90, 세로 100, 높이 110인 박스를 하나 참조하기
	   Box b2 = new Box(90, 100, 110);
	   */
	
	} 
}