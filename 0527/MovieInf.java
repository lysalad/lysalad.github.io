public class MovieInf {
	
	String title;
	String director;
	int publishYear;
	double score;
	
	//생성자 만들기
	
	/* 생성자 이름은 class와 똑같고 return 타입은 없다.
	 () 안 속 부분만 고민해주면 된다.
	 {} 안에는 필드를 초기화하는 문장들이 들어갈 수 있다.
	 흐름도 문장으로 작성이 가능하다. 우선 필드를 초기화하도록 하자.*/
	 
	public MovieInf(String t
					, double s
					, String d
					, int p) {
		//필드 초기화 : 필요한 만큼의 자료를 파라미터에 적어준다.
		
	}
	
	public void MovieInfAllState() {
		
		System.out.println(title);
		System.out.println(director);
		System.out.println(publishYear);
		System.out.println(score);
	}
	
	
}