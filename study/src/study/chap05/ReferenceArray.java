package study.chap05;

public class ReferenceArray {

	public static void main(String[] args) {
		//String ��ü�� ���������� �����ϴ� �迭�� 5�� ����
		String arr[] = new String[5];
		//arr[i] : String ��ü�� �ּҸ� �����ؾ� ��
		
		arr[0] = "ȫ�浿";
		arr[1] = "�ڹ�";
		arr[2] = new String("��λ�");
		System.out.println(arr[1].length());
		System.out.println(arr[2].length());
	}

}
