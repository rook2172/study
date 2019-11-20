package study.chap07.abstract_class;

public class MsinExample {

	public static void main(String[] args) {
		Phone phone = new Phone("ȫ�浿");
		Phone phone2 = new SmartPhont("ȫ�浿");
		phone2 = new NotePhont("ȫ�浿");
		Phone2.turnOn();
		Phone2.turnOff();
		SmartPhone sp = (SmartPhone)phone2;
		sp.turnOn();
		sp.internetSearch("http:");
		sp.turnOff();
		

	}

}
