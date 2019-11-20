package study.chap08.interface_riview;

public class ClassA {
	
		OracleDB db;
		
		public ClassA(OracleDB oracle) {
			db = oracle;
		}
		
		public void insert() {
			db.insert();
		}
		
		public void select() {
			db.select();
		}
	
}
