public class MovieTestEx03 {
	public static void main(String [] args) {
		
		MovieInf movie1 = new MovieInf();
		
		movie1.title = "시월애(A Love Story)";
		movie1.director = "이현승";
		movie1.publishYear = 2000;
		movie1.score = 4.5;
		
		movie1.MovieInfAllState();
		
		MovieInf movie2 = new MovieInf();
		
		System.out.println(movie2.title);
		System.out.println(movie2.score);
		System.out.println(movie2.director);
		System.out.println(movie2.publishYear);
		
		// movie2.MovieInfAllState();
		
		//파라미터의 타입과 순서, 갯수를 잘 확인해야한다.
		MovieInf movie3 = new MoiveInf("새영화"
										, 7.5
										, "새감독"
										, 2022);
										
		//필드 초기화 <<
		title = t;
		score = s;
		director = d;
		year = p;
	}
}