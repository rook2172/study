package study.chap05;
/*
 * �迭 : ���� �ѹ� ũ�⸦ ���ؼ� ������ �ϸ� ũ�Ⱑ ����
 * �� ū �������� �����ϰ� ���� ��� ���ο� ũ���� �迭�� ����
 * ������ ����� �����͸� ����  -> ����
 * System.arrayCopy
 */

public class ArrayCopy {

	public static void main(String[] args) {
		int arr1[] = { 2, 4, 6, 8 };
		int arr2[] = new int[10];
		//���� : ���� �����͸� ����(�ݺ������,
/*		for(int i= 0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		arr2[4] = 10;
		*/
		System.arraycopy(arr1, 1, arr2, 1, arr1.length-1);
		arr2[4] = 10;
		for(int i= 0;i<arr2.length;i++) {
		System.out.println("arr2["+i+"]="+arr2[i]);
	}
	}

}
