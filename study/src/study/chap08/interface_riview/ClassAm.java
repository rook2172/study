package study.chap08.interface_riview;

public class ClassAm {
	
		MariaDB db;
		
		public ClassAm(MariaDB maria) {
			db = maria;
		}
		
		public void insert() {
			db.insert();
		}
		
		public void select() {
			db.select();
		}
	
}
