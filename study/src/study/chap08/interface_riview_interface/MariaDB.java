package study.chap08.interface_riview_interface;

public class MariaDB implements IDatabase {
	//∏ﬁº“µÂ : CRUD
	@Override
	public void insert() {
		System.out.println("MariaDBinsert() »£√‚µ ");
	}
	
	@Override
	public void select() {
		System.out.println("MariaDBselect() »£√‚µ ");		
	}
}
