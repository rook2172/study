package study.chap09.instance_meber_class;

public class OuterClass {
	//�ν��Ͻ� ��� Ŭ���� : ��ü(OuterClass)�� ������ �Ǿ�� 
	public class InnerClass {
		//�ʵ� : �ν��Ͻ� �ʵ�, ���� �ʵ�
		int num = 10;
		
		
//		static int snum = 30;    //����� �ȵ� 
		
		//�޼ҵ� : �ν��Ͻ� �޼ҵ�, ���� �޼ҵ�
		void method1() {
			
		}
		
		//�����޼ҵ�
//		static void method2() {		//����� �ȵ�
					
//				}
	}
	
	public static class StaticInnerClass {
		//�ʵ� : �ν��Ͻ� �ʵ�, ���� �ʵ�
		int num = 10;
		//�����ʵ� : ��ü�� �������� ���� ����(OuterClass.StaticInnerClass)
		static int snum = 30;    //����� �� 
		
		//�޼ҵ� : �ν��Ͻ� �޼ҵ�, ���� �޼ҵ�
		void method1() {
			
		}
		
		//�����޼ҵ� : ��ü�� �������� ���� ����
		static void method2() {		//����� ��
					
				}
	}
}
