package study.chap05;

public class Compare {

	public static void main(String[] args) {
		//�⺸ ������ Ÿ�� ����
		//����, �Ǽ�, ��
		int num = 10;	//������ġ : stack, ���� : ������ �ʱ�ȭ �� ��
		int var1;		//stack�� ������ ���� �ʰ�
		var1 = 20;		//stack�� ����ȴ�.(���� ���ԵǴ� ����)
		if(num == 10) {	//������ ����� ���� �� : '=='
			System.out.println(num);
		}
		
		//���� Ÿ�� ���� : �迭(array), ������(enum), Ŭ����(class), Interface(��������)
		String str = "ȫ�浿";	//str : �������� -> stack�� ����
				//"ȫ�浿" : �������� ����ȴ�. ->�ּ�
				//str���� "ȫ�浿"�̶�� String ��ü�� �ּҸ� ����
				//str = null;;	//"ȫ�浿" ��ü�� ���� �� �� �ִ� ����� ������.
		
		String str2 = "ȫ�浿";	//heap������ ����� ������ ��ü
		if(str == str2)
			System.out.println("������ ��ü�� �����Ѵ�.");
		else
			System.out.println("�ٸ� ��ü�� �����Ѵ�.");
		if(str.equals(str2))
			System.out.println("���� ������ ���� ������.");
		else
			System.out.println("�ٸ� ������ ���� ������.");
		
			System.out.println("str2�� ���ڿ��� ���� ="+ str2.length());
		String str3 = null;		//�ƹ��͵� �������� ����
	//	str3 = method1();			//�޼ҵ��� �������� null�� ��ȯ�Ǵ� ���
		if(str3 !=null)
			System.out.println("str2�� ���ڿ��� ���� ="+ str3.length());		
		else
			System.out.println("������");
		
		if(str.equals(str2)) {
			System.out.println("���� ����(��)");
		}else
			
	}

	private static String method1() {
		// TODO Auto-generated method stub
		return null;
	}

}
