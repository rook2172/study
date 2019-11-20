package study.chap08.interface_riview_interface;

public class OracleDB implements IDatabase {

	@Override
	public void insert() {
		System.out.println("OracleDBinsert() »£√‚µ ");
		
	}

	@Override
	public void select() {
		System.out.println("OracleDBselec() »£√‚µ ");
		
	}	
	
	@Override
	public void update(int balance) {
		System.out.println("OracleDB:update() »£√‚µ ");
		
	}

}
