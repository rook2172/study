package study.chap05;

public class ArrayExample {

	public static void main(String[] args) {
		// C��� int arr[4] ���������� �ڹٿ����� 4�� �������� ���Ѵ�.
		//�ڹ� : �迭 -> ��ü(Class) -> �ν��Ͻ�ȭ(��ü�� ����): �޸𸮸� �Ҵ�
		int[] arr1 = new int[4];		//new : ��ü�� �����ϱ� 
		//arr1 : ���� ���� (�ּҸ� ����)
		int[] arr2 = null;
//		arr2[2] = 10;
		arr1[2] = 20;
		System.out.println("arr1[2]="+arr1[2]);
		
	    double darr[] = new double[10];   										//���1
		for(int i = 0;i < 10;i++) {
			darr[i] = 0.1;
		}
		for(int i = 0;i < 10;i++) {
			System.out.println("darr["+i+"]="+darr[i]);
		}
		
		String str1 = "ȫ�浿";			//���� �Ұ�
		String str2 = new String("ȫ�浿");		//���� ����
		str2.replace("�̹��", "ȫ�浿");		//���� �޼ҵ� : replace
		System.out.println(str2);
		
	    int nArr[] = {1,2,3,4,5};		//heap ������ int 5���� �Ҵ��� �ǰ� ���� �����.   //���2
	    int aarr[] = new int[10];
	    for(int i=0;i<aarr.length;i++) {
	    	System.out.println(aarr[i]);
	    }
		

	}

}
