package study.chap08.interface_riview_interface;

public class MariaDB implements IDatabase {
	//�޼ҵ� : CRUD
	@Override
	public void insert() {
		System.out.println("MariaDBinsert() ȣ���");
	}
	
	@Override
	public void select() {
		System.out.println("MariaDBselect() ȣ���");		
	}
}
