package study.chap08.interface_riview;

public class ServerExample {

	public static void main(String[] args) {
		ClassA oracle = new ClassA(new OracleDB());
		oracle.insert();
	}

}
