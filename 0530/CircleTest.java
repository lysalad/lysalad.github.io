// 교재 203pp.

class point { //x y 좌표값을 가지고 있다.
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter만 가지고 있는 이유는 초기화만 해주기 위해서이다.
	// setter가 없으므로 값을 설정해줄 순 없다. 
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

class Circle {
	private int radius = 0;
	private Point center; // point의 참조 변수가 필드로 설정되어 있다.
	//has-a 관계
	
	//생성자
	public Circle(Point p, int r){
		center = p;
		radius = r; 
	}
	
	//중심점 getter
	public Point getPoint()	{
		return center;
	}
	
	public void setPoint(Point p) {
		this.center = p; //this는 안써도 괜찮다.
	}
}

public class CircleTest {
		public static void main(String [] args) {
			Point p = new Point(25, 78);
			Circle c = new Circle(p, 10); //반지름이 10이면서 중심점이 p(25, 78)
			
			
			System.out.println(p.getX());
			System.out.println(c.getPoint().getX());
		}
	}