package study.chap08.interface_problem03;

public class ClassA {
	Soundable ss;
	
	public ClassA(Soundable ss) {
		this.ss = ss;
	}
	
	public void sound() {
		ss.sound();
	}

}
