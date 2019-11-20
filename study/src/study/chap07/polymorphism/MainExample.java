package study.chap07.polymorphism;

public class MainExample {

	public static void main(String[] args) {
		//참조변수 dog을 사용해서 접근 가능한것 : 부모+자식 모두 참조한다.
		Dog dog = new Dog();
		dog.age = 11;		//부모가 정의한 필드
		dog.sound();		//자식이 재정의한 메소드
		dog.method1();		//부모가 정의한 메소드
		dog.count = 2;		//자식이 정의한 메소드
		
		
		//자동타입변환 : 부모객체가 자식객체를 대입받는 것
		Animal animal = dog;
		animal.kind = "개";
		animal.age = 12;
//		animal.count - 2;		//에러발생-animal 참조변수는 Animal 타입임므로 부모가 정의한 필드와 메소드만 접근 가능
		
//		animal.method();
		animal.sound();		//자식객체 호출
		animal.method1();
		
		Animal a2 = new Cat();		//자동타입변환
		a2.sound();
		a2=dog;
		a2.sound();
		
		method(dog);
		method(new Cat());
	}

	private static void method(Cat cat) {
		// TODO Auto-generated method stub
		
	}

	private static void method(Dog dog) {
		// TODO Auto-generated method stub
		
	}
	

}
