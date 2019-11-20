package study.chap06.final_static;

public class Person {
	//final로 선언 하면 수정 불가
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
