package study.chap06;

public class MyClass {
	//�������
	//1. �ʵ� : Ŭ������ �Ӽ�, ����, ����ǰ
	int field1;
	String field2;
	
	//2. ������ : �ʵ��� �ʱ�ȭ -> ������ �޼ҵ�(��ȯ���� ����)
	public MyClass() {
		field1 = 10;		//�ʱ�ȭ
		field2 = "����";
	}
	
	//3. �޼ҵ� : �ʵ尪�� �����Ű�� ����, ����
	public void method1() {		//�ʵ带 ����� �޼ҵ�
		System.out.println("field1 = "+ field1);
	}
	
	//add()
	public int method2(int a, int b) {		//�ʵ带 ������� ���� �޼ҵ�
		return a + b;
	}
	
	//�ʵ� field1�� ���� �Ű������� ���޵� field1���� ����(����)
	public void setField1(int field1) {		//�Ű������� �ʵ��� ���� ���
		this.field1 = field1;		//�Ϲ������� ���� �̸��� ���� ����ϹǷ� this�� �ٿ� �����Ͽ� ����Ѵ�.
		
		field3 = 10;
	}

	int field3;
}
