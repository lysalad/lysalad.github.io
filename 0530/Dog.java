/* 
강아지 dog 클래스
name : 이름 breed : 종 age : 나이

1. 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는 생성자

2. 강아지 이름, 종을(2개만 전달받은 값) 전달받은 값으로 초기화하고
나이는 1살로 초기화 할 수 있는 생성자

3. 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
각 필드의 public한 getter/setter 작성하기
*/

public class Dog {
	
	public String name;
	public String breed;
	public int age;
	
// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는 생성자
// 필드와 생성자의 이름은 같아도 괜찮다.
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
// 강아지 이름, 종을(2개만 전달받은 값) 전달받은 값으로 초기화하고
//나이는 1살로 초기화 할 수 있는 생성자

	public Dog(String name, String breed) {
		// public dog(String n, String b, int a) {
		// name = n;
		// breed = b;
		// age = 1;
		this(name, breed, 1);
	}

	
 // 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
// 각 필드의 public한 getter/setter 작성하기	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name; //앞에 this가 생략되어있다. 붙여도 되고 안 붙여도 된다.
	}
	
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printAll() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
		
	}
}

