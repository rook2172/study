package study.chap08.interface_riview;

public class MariaDbEample {

	public static void main(String[] args) {
		ClassAm maria = new ClassAm(new MariaDB());
		maria.insert();

	}

}
