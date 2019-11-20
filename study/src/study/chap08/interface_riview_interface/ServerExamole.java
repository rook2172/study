package study.chap08.interface_riview_interface;

public class ServerExamole {

	public static void main(String[] args) {
		ClassA classA = new ClassA(new OracleDB());
		classA.insert();
		classA.select();
		classA.update(1000);
		ClassA classB = new ClassA(new MariaDB());
		classB.insert();
		classB.select();
	}
}
