package study.chap06.access_modifier;

public class Car {
	//�ʵ�
	public int field1;
	protected int field2;		//�ٸ� ��Ű���� �ִ� Ŭ�������� ���� �Ұ���, ���� ��ӹ��� Ŭ������ ���� ����
	int field3;					//���� ��Ű������ Ŭ������ ���� ����(default)
	private int field4;			//�ڽ��� Ŭ������������ ����
	//������
	public Car() {}
	private Car(String value) {
		this.str = value;
	}
	
	protected Car(int value) {
		this.field1 = value;
	}
	//�޼ҵ�
	public void method1() {
		System.out.println("");
	}
	protected void method2() {
		
	}
	void method3() {
		
	}
	private void method4() {
		
	}
	

}
