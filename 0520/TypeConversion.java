//교재 96pp.
public class TypeConversion{
	
	public static void main(String[] args){
		int i;
		double f;
		
		f = 5 / 4;
		
		System.out.println(f);
		//5에만 더블을 해줬지만, 확장되어서 실수형끼리 연산을 한다.
		f = (double) 5 / 4;
		System.out.println(f);
		//4에만 더블을 해줬지만, 같이 화장되어 실수형끼리 연산을 한다.
		f = 5 / (double) 4;
		System.out.println(f);
		
		f = (double) 5 / (double) 4;
		System.out.println(f);
		// 손실을 감안하고 실수를 int 정수형으로 바꿔주었기 때문에 결과가 2
		i = (int) 1.3 + (int) 1.8;
		System.out.println(i);
		// 실수가 더해진 값을 통채로 int 정수형으로 바꿔주었기 때문에 결과가 3
		i = (int) (1.3 + 1.8);
		System.out.println(i);
		
	}
}

//자료의 확장은 자동으로 일어나지만, 축소는 그렇지 않다.