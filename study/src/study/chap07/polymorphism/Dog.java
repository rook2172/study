package study.chap07.polymorphism;

public class Dog extends Animal {
	int count;
	
	public void method() {
		sound();
		age = 10;
	}
	
	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
		super.sound();
	}

}
