package study.chap09.instance_meber_class;

public class MainExamole {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		//InnerClass : �ν��Ͻ� ��� Ŭ���� (��ü ���� �� ��� ����)
		OuterClass.InnerClass instanceClass = new OuterClass.InnerClass();
		instanceClass = outer.new InnerClass();		//�ν��Ͻ� ��� Ŭ���� ����
		instanceClass.num = 10;
		instanceClass.method1();
		
		//���� Ŭ����
		OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
		staticClass.num = 20;		//��ü�� �Ѱ����� ����
//		staticClass.snum = 3;		
		OuterClass.StaticInnerClass.snum = 30;	//��ü �Ѱ����� ���� ���� �ʴ´�.--�Ѱ��� ����(������)
		staticClass.method1();
		OuterClass.StaticInnerClass.method2();
//		OuterClass.StaticInnerClass.num = 30;		//�ν��Ͻ� �ʵ�� Ŭ���� �̸����� ���� �Ұ�
		
	}

}
