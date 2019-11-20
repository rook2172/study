package study.chap07.inherit_constructor;

public class B extends A {
	int f3;
	public B() {
		System.out.println("B()È£Ãâ");
	}
	
	public B(int f3) {
		this.f3 = f3;
	}
//	
//	public B(int f1, String s1, int f3) {
//		super(f1, s1);
//		this.f3 = f3;
//	}

}
