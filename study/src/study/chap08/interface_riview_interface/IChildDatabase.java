package study.chap08.interface_riview_interface;

public interface IChildDatabase extends IDatabase {
	//default 메소드를 가진 인터페이스를 상속하는 경우
	//경우1:부모 인페이스에서 정의된 default 메소드를 그대로 사용.
	//경우2:부모 인페이스에서 정의된 default 메소드를 재정의.
	//경우3:default 메소드를 추상메소드를 변경하여 사용.

}
