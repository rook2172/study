package study.chap07.compel_castion;

public class Child extends Parent {
	//�θ��ʵ� ;f1, �޼ҵ� pmethod1(), �޼ҵ� pmethod2() ��밡��
	
	int cf1;
	
	//�޼ҵ�
	@Override
	public void pmethod1() {
		System.out.println("pmethod1(������) ȣ���");
	}
	
	public void cmethod1() {
		System.out.println("cmethod1 ȣ���");
	}
}
