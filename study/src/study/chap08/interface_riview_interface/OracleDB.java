package study.chap08.interface_riview_interface;

public class OracleDB implements IDatabase {

	@Override
	public void insert() {
		System.out.println("OracleDBinsert() ȣ���");
		
	}

	@Override
	public void select() {
		System.out.println("OracleDBselec() ȣ���");
		
	}	
	
	@Override
	public void update(int balance) {
		System.out.println("OracleDB:update() ȣ���");
		
	}

}
