package study.chap08.interface_riview_interface;

public interface IDatabase {
	//추상메소드	
	void insert();
	void select();
	
	//새로운 기능 추가 -- default
	default void update(int balance) {
		System.out.println("update() 호출됨");
	}
}
