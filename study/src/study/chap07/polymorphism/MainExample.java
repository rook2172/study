package study.chap07.polymorphism;

public class MainExample {

	public static void main(String[] args) {
		//�������� dog�� ����ؼ� ���� �����Ѱ� : �θ�+�ڽ� ��� �����Ѵ�.
		Dog dog = new Dog();
		dog.age = 11;		//�θ� ������ �ʵ�
		dog.sound();		//�ڽ��� �������� �޼ҵ�
		dog.method1();		//�θ� ������ �޼ҵ�
		dog.count = 2;		//�ڽ��� ������ �޼ҵ�
		
		
		//�ڵ�Ÿ�Ժ�ȯ : �θ�ü�� �ڽİ�ü�� ���Թ޴� ��
		Animal animal = dog;
		animal.kind = "��";
		animal.age = 12;
//		animal.count - 2;		//�����߻�-animal ���������� Animal Ÿ���ӹǷ� �θ� ������ �ʵ�� �޼ҵ常 ���� ����
		
//		animal.method();
		animal.sound();		//�ڽİ�ü ȣ��
		animal.method1();
		
		Animal a2 = new Cat();		//�ڵ�Ÿ�Ժ�ȯ
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
