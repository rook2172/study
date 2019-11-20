package study.chap08.interface_riview_interface;

public interface IChildDatabaseo extends IDatabase {
	@Override
	default void update(int balance) {
		System.out.println("IChildDatabaseo:update() »£√‚µ ");
	}
}
