public class dogTest {
	public static void main(String [] args) {
		
		Dog d1 = new Dog("초코", "푸들", 7);
		Dog d2 = new Dog("예삐", "말티즈");
		
		// System.out.println(d1.getName());	
		// System.out.println(d1.getName());

		d1.printAll();
		d2.printAll();		
		
	}
}