package study.chap08.interface_riview_interface;

public class ClassA {
	IDatabase db;

	public ClassA(IDatabase db) {
		this.db = db;
	}
	
	public void insert() {
		db.insert();
	}
	
	public void select() {
		db.select();
	}
	
	public void update(int balance) {
		db.update(balance);
	}
}
