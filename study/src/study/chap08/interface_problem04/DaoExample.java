package study.chap08.interface_problem04;

public class DaoExample {
	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();		
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySql());
	}

}
