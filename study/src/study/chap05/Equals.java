package study.chap05;

public class Equals {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String ("ȫ�浿");
		String str4 = new String ("ȫ�浿");
		
		if(str1 == str2)		//�ּ� ��
			System.out.println("���� ��ü�� ����");		//����
		else
			System.out.println("�ٸ� ��ü�� ����");
		
		if(str2 == str3)		//�ּ� ��
			System.out.println("���� ��ü�� ����");
		else
			System.out.println("�ٸ� ��ü�� ����");	//����
		
		//��ü�� ���� ��
		if(str1.equals(str2))
			System.out.println("���� ����(��)");		//����
		else
			System.out.println("�ٸ� ����(��)");
		if(str2.equals(str3))
			System.out.println("���� ����(��)");		//����
		else
			System.out.println("�ٸ� ����(��)");

	}

}
