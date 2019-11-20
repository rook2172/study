package study.chap06.problem18;

public class ShopService {
	private static ShopService instance = new ShopService();
	private ShopService() {}
	public static ShopService getInstance() {
		return instance;
	}

}
