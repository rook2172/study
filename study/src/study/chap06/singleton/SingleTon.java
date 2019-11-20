package study.chap06.singleton;

/*
 * ��Ŭ��(SingleTon) : ��ü�� �ϳ��� ����
 * � �����͸� �ѱ������� ������ �Ѵ�.
 * ���׸� ������ ����� �������� ����ġ -> ��ü�� �ϳ��� �����ϰ� �ʹ�.
 */
public class SingleTon {
	//1. ���� �ʵ� instance
	private static SingleTon instance = new SingleTon();		//private : �ڽ��� Ŭ���������� ���� ����
	
	//2. private ������ ����
	private SingleTon() {}		//������
	
	//3.��ü�� ������  �ּҸ� ���� �� �ִ� �޼ҵ带 ����
	public static SingleTon getInstance() {
		System.out.println("���� ȣ���");
		return instance;
	}
	
	int data[] = new int[10];
}
