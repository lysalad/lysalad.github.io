/* 의자 클래스
제조사, 생산일자, 가격, 모델병

초기화 할 수 있는 생성자
main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보기*/

 
public class chair {
	
	String manu;
	int date;
	double price;
	String model;
	
	// 생성자 이용하기
	public chair(String m
				, int d
				, double p
				, String m2) {
		manu = m;
		date = d;
		price = p;
		model = m2;
	}
	
	//기본 값으로 초기화용
	public chair() {
		
		String manu;
		int date;
		double price;
		String model;
		
	}
	
	void printAll() {
		System.out.println(manu);
		System.out.println(date);
		System.out.println(price);
		System.out.println(model);
	}
	
	
	public static void main(String [] args) {
		
		// 값 나오게
		chair c1 = new chair("어느회사"
							, 20220201
							, 113.5
							, "dododo-2");
							
		System.out.println(c1.manu);
		System.out.println(c1.date);
		System.out.println(c1.price);
		System.out.println(c1.model);
		
		chair c4 = new chair("어디어디"
							, 20220101
							, 127.5
							, "TTTN-2");
	    c1.printAll();
		c4.printAll();
		
		
		
		// 초기화
		chair c2 = new chair();
		
		System.out.println("\n" + c2.manu);
		System.out.println(c1.date);
		System.out.println(c1.price);
		System.out.println(c1.model);
		
		// 고전적인 방법(?)
		chair c3 = new chair();
		
		c3.manu = "시디즈";
		c3.date = 20220527;
		c3.price = 115.6;
		c3.model = "T50";
		
	}
	
 }