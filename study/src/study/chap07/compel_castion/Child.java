package study.chap07.compel_castion;

public class Child extends Parent {
	//부모필드 ;f1, 메소드 pmethod1(), 메소드 pmethod2() 사용가능
	
	int cf1;
	
	//메소드
	@Override
	public void pmethod1() {
		System.out.println("pmethod1(재정의) 호출됨");
	}
	
	public void cmethod1() {
		System.out.println("cmethod1 호출됨");
	}
}
