public class NotOperator{
	public static void main(String[] args){
		 boolean t = true;
		 
		 t = !t;
		 System.out.println(t); //결과는 false로 나온다.
		 
		 
		 !((10 > 3) && (3 == 3)) //!가 붙어서 false로 나온다.
		 !(!(10>3) || (3 == 3)) // flase 10>3을 false로 만들었기 때문에
		 
	}
}